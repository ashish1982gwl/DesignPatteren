package com.ashish.structual.facade;

public class Facade {
	Sort alorithem;
	public void getMergeSort() {
		alorithem=new Marge();
		alorithem.algorithem();
	}
	public void getHeapSort() {
		alorithem=new Heap();
		alorithem.algorithem();
	}
	public void getRadixSort() {
		alorithem=new Radix();
		alorithem.algorithem();
	}

}
