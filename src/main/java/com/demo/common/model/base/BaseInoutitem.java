package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseInoutitem<M extends BaseInoutitem<M>> extends Model<M> implements IBean {

	/**
	 * 主键
	 */
	public void setId(java.lang.Long Id) {
		set("Id", Id);
	}
	
	/**
	 * 主键
	 */
	public java.lang.Long getId() {
		return getLong("Id");
	}

	/**
	 * 名称
	 */
	public void setName(java.lang.String Name) {
		set("Name", Name);
	}
	
	/**
	 * 名称
	 */
	public java.lang.String getName() {
		return getStr("Name");
	}

	/**
	 * 类型
	 */
	public void setType(java.lang.String Type) {
		set("Type", Type);
	}
	
	/**
	 * 类型
	 */
	public java.lang.String getType() {
		return getStr("Type");
	}

	/**
	 * 备注
	 */
	public void setRemark(java.lang.String Remark) {
		set("Remark", Remark);
	}
	
	/**
	 * 备注
	 */
	public java.lang.String getRemark() {
		return getStr("Remark");
	}

	/**
	 * 租户id
	 */
	public void setTenantId(java.lang.Long tenantId) {
		set("tenant_id", tenantId);
	}
	
	/**
	 * 租户id
	 */
	public java.lang.Long getTenantId() {
		return getLong("tenant_id");
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