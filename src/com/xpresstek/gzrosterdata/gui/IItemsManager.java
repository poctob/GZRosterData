package com.xpresstek.gzrosterdata.gui;

import java.util.ArrayList;

import com.xpresstek.gzrosterdata.sql.DBObjectType;

public interface IItemsManager {

	ArrayList<String> getData(DBObjectType type);

	void deleteItem(Object item, DBObjectType type);

	Object getItem(String selection, DBObjectType type);
	
	void updateObject(Object oldObj, Object newObj, DBObjectType type);
	
	void insertObject(Object newObj, DBObjectType type);

}
