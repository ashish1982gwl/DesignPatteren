package com.ashish.creational.abstractFactory;

public class AbstartFactory {

	public Bank getBank(String bankName) {
		if (bankName.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		if (bankName.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		}
		if (bankName.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		}
		return null;
	}

	public Loan getLoan(String loanType) {
		if (loanType.equalsIgnoreCase("VechileLoan")) {
			return new VechileLoan();
		}
		if (loanType.equalsIgnoreCase("PersonalLoan")) {
			return new PersonalLoan();
		}
		if (loanType.equalsIgnoreCase("HomeLoan")) {
			System.out.println("HomeLaon");
			return new HomeLaon();
		}
		return null;
	}

}
