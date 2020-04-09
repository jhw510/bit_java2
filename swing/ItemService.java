package com.jse.swing;

public class ItemService {

	private Item[] items;

	public ItemService() {
		items = new Item[10];
	}
	public  void setItems(Item[] Items) {
		this.items = items;
	}
	public  Item[] getItems() {
		return items;
}
}
