package com.ashish.structual.facade;

public class FacadePatterenTest {
	public static void main(String a[]) {
		Facade facade=new Facade();
		facade.getHeapSort();
		facade.getMergeSort();
		facade.getRadixSort();
	}

}
