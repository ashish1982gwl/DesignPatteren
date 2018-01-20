package com.ashish.behaviour.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> itemList = null;

	public ShoppingCart() {
		itemList = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		this.itemList.add(item);
	}

	public void removeItem(Item item) {
		this.itemList.remove(item);
	}

	public int calculateTotal() {
		int sum = 0;
		for (Item item : itemList) {
			sum += item.getPrice();
		}
		return sum;
	}

	public void pay(Payment paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}
