package com.mycoolwebapp.mycoolwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycoolwebapp.mycoolwebapp.model.ItemMaster;
import com.mycoolwebapp.mycoolwebapp.repository.ItemMasterRepository;

@Service
public class ItemMasterServiceImpl implements ItemMasterService {
	
	@Autowired
	ItemMasterRepository itemMasterRepository;

	@Override
	public boolean save(ItemMaster item) {
		itemMasterRepository.save(item);
		return true;	
	}

	@Override
	public List<ItemMaster> getAllItems() {
		List<ItemMaster> items = (List<ItemMaster>) itemMasterRepository.findAll();
		
		return items;
	}

}
