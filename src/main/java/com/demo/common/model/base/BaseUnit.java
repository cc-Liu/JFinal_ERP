package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUnit<M extends BaseUnit<M>> extends Model<M> implements IBean {

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
	 * 名称，支持多单位
	 */
	public void setUName(java.lang.String UName) {
		set("UName", UName);
	}
	
	/**
	 * 名称，支持多单位
	 */
	public java.lang.String getUName() {
		return getStr("UName");
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