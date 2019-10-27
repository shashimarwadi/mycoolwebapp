package com.mycoolwebapp.mycoolwebapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "order_item_details")
@IdClass(OrderItemKey.class)
public class OrderItemDetails {

	@Id
	@Column(name = "ordernumber")
	private long orderNumber;
	@Id
	@Column(name = "itenid")
	private String itemID;
	
	private int quantity;
	
	
	public long getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
