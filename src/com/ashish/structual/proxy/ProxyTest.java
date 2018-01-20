package com.ashish.structual.proxy;

public class ProxyTest {
public static void main(String a[]) {
	GetBean GetBean=new GetBean();
	SBI SBI=(SBI)GetBean.getBank("SBI");
	SBI.getBankName();
}
}
