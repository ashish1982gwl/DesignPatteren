package com.ashish.creational.abstractFactory;

public class AbstractFactoryExample {
	public static void main(String a[]) {
		AbstartFactory abstartFactory = new AbstartFactory();
		Bank bank = abstartFactory.getBank("SBI");
		System.out.println(bank.getBankName());
		Loan loan = abstartFactory.getLoan("HomeLoan");
		System.out.println(loan.getEMI(20, 8, 2000000l));

	}

}
