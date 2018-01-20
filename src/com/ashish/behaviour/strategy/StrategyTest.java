package com.ashish.behaviour.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item(1,100);
		Item item2 = new Item(2,400);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.pay(new InternetBanking("myemail@example.com", "mypwd"));
		
		//pay by credit card
		cart.pay(new CreditCard( "1234567890123456", "786", "12/15"));
	}

}