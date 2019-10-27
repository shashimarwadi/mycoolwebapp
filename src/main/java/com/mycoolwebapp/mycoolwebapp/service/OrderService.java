package com.mycoolwebapp.mycoolwebapp.service;

import java.util.List;

import com.mycoolwebapp.mycoolwebapp.model.OrderHeader;
import com.mycoolwebapp.mycoolwebapp.model.OrderItemDetails;

public interface OrderService {
	public long saveHeader(OrderHeader orderHeader);
	public boolean saveItems(OrderItemDetails[] orderItemDetails, long orderNumber);
	
	public List<OrderHeader> getAllOrderHeaders();
	public List<OrderItemDetails> getAllOrderItemDetails();
}
