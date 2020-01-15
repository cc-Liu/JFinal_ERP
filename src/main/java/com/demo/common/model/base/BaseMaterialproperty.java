package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMaterialproperty<M extends BaseMaterialproperty<M>> extends Model<M> implements IBean {

	/**
	 * 主键
	 */
	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	/**
	 * 主键
	 */
	public java.lang.Long getId() {
		return getLong("id");
	}

	/**
	 * 原始名称
	 */
	public void setNativeName(java.lang.String nativeName) {
		set("nativeName", nativeName);
	}
	
	/**
	 * 原始名称
	 */
	public java.lang.String getNativeName() {
		return getStr("nativeName");
	}

	/**
	 * 是否启用
	 */
	public void setEnabled(java.lang.Boolean enabled) {
		set("enabled", enabled);
	}
	
	/**
	 * 是否启用
	 */
	public java.lang.Boolean getEnabled() {
		return get("enabled");
	}

	/**
	 * 排序
	 */
	public void setSort(java.lang.String sort) {
		set("sort", sort);
	}
	
	/**
	 * 排序
	 */
	public java.lang.String getSort() {
		return getStr("sort");
	}

	/**
	 * 别名
	 */
	public void setAnotherName(java.lang.String anotherName) {
		set("anotherName", anotherName);
	}
	
	/**
	 * 别名
	 */
	public java.lang.String getAnotherName() {
		return getStr("anotherName");
	}

	/**
	 * 删除标记，0未删除，1删除
	 */
	public void setDeleteFlag(java.lang.String deleteFlag) {
		set("delete_Flag", deleteFlag);
	}
	
	/**
	 * 删除标记，0未删除，1删除
	 */
	public java.lang.String getDeleteFlag() {
		return getStr("delete_Flag");
	}

}