package com.ashish.structual.proxy;

import com.ashish.structual.*;

public class GetBean {
	public Object getBank(String bankName) {
		Object object = null;
		if (bankName.equalsIgnoreCase("SBI")) {
			getBeforeMethodCalling(bankName);

			object = new SBI();
		}
		if (bankName.equalsIgnoreCase("HDFC")) {
			getBeforeMethodCalling(bankName);

			object = new HDFC();
		}
		if (bankName.equalsIgnoreCase("ICICI")) {
			getBeforeMethodCalling(bankName);
			object = new ICICI();
		}
		return object;
	}

	private void getBeforeMethodCalling(String bankName) {
		System.out.println(bankName + " Object is calling ");
	}
}
