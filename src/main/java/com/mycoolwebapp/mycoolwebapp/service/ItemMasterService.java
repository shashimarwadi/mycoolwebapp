package com.mycoolwebapp.mycoolwebapp.service;

import java.util.List;

import com.mycoolwebapp.mycoolwebapp.model.ItemMaster;

public interface ItemMasterService {

	public boolean save(ItemMaster item);
	public List<ItemMaster> getAllItems();
	
}
