package com.wuyufei.domain;
// Generated 2015-6-2 0:00:32 by Hibernate Tools 3.4.0.CR1

/**
 * OrderList generated by hbm2java
 */
public class OrderList implements java.io.Serializable {

	private Integer orderId;
	private String productName;
	private int price;
	private int qty;
	private String bussinessId;
	private String telephone;
	private String address;

	public OrderList() {
	}

	public OrderList(String productName, int price, int qty,
			String bussinessId, String telephone, String address) {
		this.productName = productName;
		this.price = price;
		this.qty = qty;
		this.bussinessId = bussinessId;
		this.telephone = telephone;
		this.address = address;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getBussinessId() {
		return this.bussinessId;
	}

	public void setBussinessId(String bussinessId) {
		this.bussinessId = bussinessId;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}