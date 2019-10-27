package com.mycoolwebapp.mycoolwebapp.model;

public class MyCoolOrder {

	OrderHeader header;
	OrderItemDetails[] itemDetails;
	
	public OrderHeader getHeader() {
		return header;
	}
	public void setHeader(OrderHeader header) {
		this.header = header;
	}
	public OrderItemDetails[] getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(OrderItemDetails[] itemDetails) {
		this.itemDetails = itemDetails;
	}
	
	
}
