package com.demo.blog;

import com.jfinal.aop.Before;
import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.demo.common.model.Blog;
import com.jfinal.kit.Kv;
import com.jfinal.log.Log;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;

import java.util.List;


/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * 所有 sql 与业务逻辑写在 Service 中，不要放在 Model 中，更不
 * 要放在 Controller 中，养成好习惯，有利于大型项目的开发与维护
 */
@Before(BlogInterceptor.class)
public class BlogController extends Controller {
	private Log log = Log.getLog(BlogController.class);

	@Inject
	BlogService service;
	
	public void index() {

		log.info("info测试测试");
		setAttr("blogPage", service.paginate(getParaToInt(0, 1), 10));
		render("blog.html");
	}
	
	public void add() {
	}
	
	/**
	 * save 与 update 的业务逻辑在实际应用中也应该放在 serivce 之中，
	 * 并要对数据进正确性进行验证，在此仅为了偷懒
	 */
	@Before(BlogValidator.class)
	public void save() {
		getBean(Blog.class).save();
		redirect("/blog");
	}
	
	public void edit() {
		setAttr("blog", service.findById(getParaToInt()));
	}
	
	/**
	 * save 与 update 的业务逻辑在实际应用中也应该放在 serivce 之中，
	 * 并要对数据进正确性进行验证，在此仅为了偷懒
	 */
	@Before(BlogValidator.class)
	public void update() {
		log.info("修改修改");
		getBean(Blog.class).update();
		redirect("/blog");
	}
	
	public void delete() {
		log.info("删除删除");
		service.deleteById(getParaToInt());
		redirect("/blog");
	}


	public void selectByBlogId(Integer pageNumber, Integer pageSize, Integer id, String title) {
		if(!"".equals(title) && title != null){
			title = "%" + title + "%";
		}
		Kv count = Kv.by("id",id).set("title",title);
		SqlPara sqlPara = Db.getSqlPara("findGirl",count);
		//Page<Record> blogList = Db.paginate(pageNumber,pageSize,sqlPara);

		List<Record> records =  Db.find("select * from blog");
		renderJson(records);
	}
}


