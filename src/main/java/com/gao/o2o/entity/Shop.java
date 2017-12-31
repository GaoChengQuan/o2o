package com.gao.o2o.entity;

import java.util.Date;

import org.aspectj.weaver.AjAttribute.PrivilegedAttribute;

public class Shop {
	private Long shopId;
	private String shopName;
	private String shopDesc;
	private String shopAddr;
	private String phone;
	private String shopImg;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	// -1:不可用（店铺既不能出现在前端展示系统中，店家也不能登录发布自己的商品 ）
	// 0:审核中 （店铺刚刚创建出来，等待超级管理员审核，前端是看不到的，但是店家可以登录后台添加商品）
	// 1:可用（店铺通过审核，可以发布商品，顾客可以看到）
	private Integer enableStatus;
	// 超级管理员给店家的提醒
	private String advice;
	private Area area;
	private PersonInfo owner;
	private ShopCategory shopCategory;

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopDesc() {
		return shopDesc;
	}

	public void setShopDesc(String shopDesc) {
		this.shopDesc = shopDesc;
	}

	public String getShopAddr() {
		return shopAddr;
	}

	public void setShopAddr(String shopAddr) {
		this.shopAddr = shopAddr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getShopImg() {
		return shopImg;
	}

	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public PersonInfo getOwner() {
		return owner;
	}

	public void setOwner(PersonInfo owner) {
		this.owner = owner;
	}

	public ShopCategory getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(ShopCategory shopCategory) {
		this.shopCategory = shopCategory;
	}

}
