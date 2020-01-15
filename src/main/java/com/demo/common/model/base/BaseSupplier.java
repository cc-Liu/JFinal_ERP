package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSupplier<M extends BaseSupplier<M>> extends Model<M> implements IBean {

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
	 * 供应商名称
	 */
	public void setSupplier(java.lang.String supplier) {
		set("supplier", supplier);
	}
	
	/**
	 * 供应商名称
	 */
	public java.lang.String getSupplier() {
		return getStr("supplier");
	}

	/**
	 * 联系人
	 */
	public void setContacts(java.lang.String contacts) {
		set("contacts", contacts);
	}
	
	/**
	 * 联系人
	 */
	public java.lang.String getContacts() {
		return getStr("contacts");
	}

	/**
	 * 联系电话
	 */
	public void setPhonenum(java.lang.String phonenum) {
		set("phonenum", phonenum);
	}
	
	/**
	 * 联系电话
	 */
	public java.lang.String getPhonenum() {
		return getStr("phonenum");
	}

	/**
	 * 电子邮箱
	 */
	public void setEmail(java.lang.String email) {
		set("email", email);
	}
	
	/**
	 * 电子邮箱
	 */
	public java.lang.String getEmail() {
		return getStr("email");
	}

	/**
	 * 备注
	 */
	public void setDescription(java.lang.String description) {
		set("description", description);
	}
	
	/**
	 * 备注
	 */
	public java.lang.String getDescription() {
		return getStr("description");
	}

	/**
	 * 是否系统自带 0==系统 1==非系统
	 */
	public void setIsystem(java.lang.Integer isystem) {
		set("isystem", isystem);
	}
	
	/**
	 * 是否系统自带 0==系统 1==非系统
	 */
	public java.lang.Integer getIsystem() {
		return getInt("isystem");
	}

	/**
	 * 类型
	 */
	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	/**
	 * 类型
	 */
	public java.lang.String getType() {
		return getStr("type");
	}

	/**
	 * 启用
	 */
	public void setEnabled(java.lang.Boolean enabled) {
		set("enabled", enabled);
	}
	
	/**
	 * 启用
	 */
	public java.lang.Boolean getEnabled() {
		return get("enabled");
	}

	/**
	 * 预收款
	 */
	public void setAdvanceIn(java.math.BigDecimal AdvanceIn) {
		set("AdvanceIn", AdvanceIn);
	}
	
	/**
	 * 预收款
	 */
	public java.math.BigDecimal getAdvanceIn() {
		return get("AdvanceIn");
	}

	/**
	 * 期初应收
	 */
	public void setBeginNeedGet(java.math.BigDecimal BeginNeedGet) {
		set("BeginNeedGet", BeginNeedGet);
	}
	
	/**
	 * 期初应收
	 */
	public java.math.BigDecimal getBeginNeedGet() {
		return get("BeginNeedGet");
	}

	/**
	 * 期初应付
	 */
	public void setBeginNeedPay(java.math.BigDecimal BeginNeedPay) {
		set("BeginNeedPay", BeginNeedPay);
	}
	
	/**
	 * 期初应付
	 */
	public java.math.BigDecimal getBeginNeedPay() {
		return get("BeginNeedPay");
	}

	/**
	 * 累计应收
	 */
	public void setAllNeedGet(java.math.BigDecimal AllNeedGet) {
		set("AllNeedGet", AllNeedGet);
	}
	
	/**
	 * 累计应收
	 */
	public java.math.BigDecimal getAllNeedGet() {
		return get("AllNeedGet");
	}

	/**
	 * 累计应付
	 */
	public void setAllNeedPay(java.math.BigDecimal AllNeedPay) {
		set("AllNeedPay", AllNeedPay);
	}
	
	/**
	 * 累计应付
	 */
	public java.math.BigDecimal getAllNeedPay() {
		return get("AllNeedPay");
	}

	/**
	 * 传真
	 */
	public void setFax(java.lang.String fax) {
		set("fax", fax);
	}
	
	/**
	 * 传真
	 */
	public java.lang.String getFax() {
		return getStr("fax");
	}

	/**
	 * 手机
	 */
	public void setTelephone(java.lang.String telephone) {
		set("telephone", telephone);
	}
	
	/**
	 * 手机
	 */
	public java.lang.String getTelephone() {
		return getStr("telephone");
	}

	/**
	 * 地址
	 */
	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	/**
	 * 地址
	 */
	public java.lang.String getAddress() {
		return getStr("address");
	}

	/**
	 * 纳税人识别号
	 */
	public void setTaxNum(java.lang.String taxNum) {
		set("taxNum", taxNum);
	}
	
	/**
	 * 纳税人识别号
	 */
	public java.lang.String getTaxNum() {
		return getStr("taxNum");
	}

	/**
	 * 开户行
	 */
	public void setBankName(java.lang.String bankName) {
		set("bankName", bankName);
	}
	
	/**
	 * 开户行
	 */
	public java.lang.String getBankName() {
		return getStr("bankName");
	}

	/**
	 * 账号
	 */
	public void setAccountNumber(java.lang.String accountNumber) {
		set("accountNumber", accountNumber);
	}
	
	/**
	 * 账号
	 */
	public java.lang.String getAccountNumber() {
		return getStr("accountNumber");
	}

	/**
	 * 税率
	 */
	public void setTaxRate(java.math.BigDecimal taxRate) {
		set("taxRate", taxRate);
	}
	
	/**
	 * 税率
	 */
	public java.math.BigDecimal getTaxRate() {
		return get("taxRate");
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