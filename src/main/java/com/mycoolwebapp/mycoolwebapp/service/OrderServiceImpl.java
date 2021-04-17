package com.mycoolwebapp.mycoolwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycoolwebapp.mycoolwebapp.model.OrderHeader;
import com.mycoolwebapp.mycoolwebapp.model.OrderItemDetails;
import com.mycoolwebapp.mycoolwebapp.repository.OrderHeaderRepository;
import com.mycoolwebapp.mycoolwebapp.repository.OrderItemDetailsRepository;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired 
	private OrderHeaderRepository orderHeaderRepository;
	@Autowired 
	private OrderItemDetailsRepository orderItemDetailsRepository;

	
	@Override
	public long saveHeader(OrderHeader orderHeader) {
		OrderHeader thisOrderHeader;
		thisOrderHeader = orderHeaderRepository.save(orderHeader);
		
		return thisOrderHeader.getOrderNumber();
	}

	@Override
	public List<OrderHeader> getAllOrderHeaders() {
		
		List<OrderHeader> orderHeaders = (List<OrderHeader>) orderHeaderRepository.findAll();
		System.out.println("Hello from Shashi....");
		System.out.println("Hello from Shashi again....");
		
		
		return orderHeaders;
	}

	@Override
	public boolean saveItems(OrderItemDetails[] orderItemDetails, long orderNumber) {
		
		for(OrderItemDetails item: orderItemDetails) {
			item.setOrderNumber(orderNumber);
			orderItemDetailsRepository.save(item);
		}
		
		return true;
	}

	@Override
	public List<OrderItemDetails> getAllOrderItemDetails() {
		List<OrderItemDetails> orderItemDetails = (List<OrderItemDetails>) orderItemDetailsRepository.findAll();
		
		return orderItemDetails;
	}
	
	
}
