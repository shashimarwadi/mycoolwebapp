package com.mycoolwebapp.mycoolwebapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_header")
public class OrderHeader {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ordernumber")
	long orderNumber;
	
	int orderDayOfMonth; 
	int orderMonth;
	int orderYear;
	int orderHour;
	int orderMinute;
	int orderSec;
	String orderTimeZone;
	
	public long getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getOrderDayOfMonth() {
		return orderDayOfMonth;
	}
	public void setOrderDayOfMonth(int orderDayOfMonth) {
		this.orderDayOfMonth = orderDayOfMonth;
	}
	public int getOrderMonth() {
		return orderMonth;
	}
	public void setOrderMonth(int orderMonth) {
		this.orderMonth = orderMonth;
	}
	public int getOrderYear() {
		return orderYear;
	}
	public void setOrderYear(int orderYear) {
		this.orderYear = orderYear;
	}
	public int getOrderHour() {
		return orderHour;
	}
	public void setOrderHour(int orderHour) {
		this.orderHour = orderHour;
	}
	public int getOrderMinute() {
		return orderMinute;
	}
	public void setOrderMinute(int orderMinute) {
		this.orderMinute = orderMinute;
	}
	public int getOrderSec() {
		return orderSec;
	}
	public void setOrderSec(int orderSec) {
		this.orderSec = orderSec;
	}
	public String getOrderTimeZone() {
		return orderTimeZone;
	}
	public void setOrderTimeZone(String orderTimeZone) {
		this.orderTimeZone = orderTimeZone;
	}
	
	
}
