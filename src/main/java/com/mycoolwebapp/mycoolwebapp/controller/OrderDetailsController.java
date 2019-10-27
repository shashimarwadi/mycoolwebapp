package com.mycoolwebapp.mycoolwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycoolwebapp.mycoolwebapp.model.MyCoolOrder;
import com.mycoolwebapp.mycoolwebapp.model.OrderHeader;
import com.mycoolwebapp.mycoolwebapp.model.OrderItemDetails;
import com.mycoolwebapp.mycoolwebapp.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderDetailsController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public  ResponseEntity<OrderHeader> createOrder(@RequestBody MyCoolOrder myCoolOrder) {
		
		System.out.println("In POST Mapping");
		
		OrderHeader orderHeader = myCoolOrder.getHeader();
		OrderItemDetails[] itemDetails = myCoolOrder.getItemDetails();
		
		long orderNo = orderService.saveHeader(orderHeader);
		
		if(orderNo <= 0)
			return new ResponseEntity<OrderHeader> (HttpStatus.INTERNAL_SERVER_ERROR);
		
		orderService.saveItems(itemDetails, orderNo);
		
		return new ResponseEntity<OrderHeader> (orderHeader, HttpStatus.CREATED);

	}	
	
	
//	@GetMapping(path="/all")
//	public @ResponseBody Iterable<OrderDetails> getOrder() {
//		return orderDetailsService.getAllOrderDetails();
//	}
}
