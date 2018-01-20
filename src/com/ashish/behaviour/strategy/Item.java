package com.ashish.behaviour.strategy;

public class Item {
private	int itemId;
private	int price;

	public Item(int itemId, int price) {
	super();
	this.itemId = itemId;
	this.price = price;
}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", price=" + price + "]";
	}

}
