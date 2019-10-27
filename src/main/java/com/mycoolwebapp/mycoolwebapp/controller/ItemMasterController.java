package com.mycoolwebapp.mycoolwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycoolwebapp.mycoolwebapp.model.ItemMaster;
import com.mycoolwebapp.mycoolwebapp.service.ItemMasterService;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemMasterController {

	@Autowired
	ItemMasterService itemMasterService;
	
	@PostMapping
	public ResponseEntity<ItemMaster> createCircle(@RequestBody ItemMaster item) {
		
		System.out.println("In POST Mapping");
		
		if(!itemMasterService.save(item))
			return new ResponseEntity<ItemMaster> (HttpStatus.INTERNAL_SERVER_ERROR);
		
		return new ResponseEntity<ItemMaster> (item, HttpStatus.CREATED);
		
	}	
	
	
	@GetMapping(path="/all")
	public @ResponseBody List<ItemMaster> getOrder() {
		return itemMasterService.getAllItems();
	}
	
}
