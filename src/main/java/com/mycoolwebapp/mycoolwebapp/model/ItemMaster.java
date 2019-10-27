package com.mycoolwebapp.mycoolwebapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemMaster {

	@Id
	String itemID;
	String itemDescription;
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	
}
