package com.ashish.creational.builder;

public class Phone {
	public Phone(int battery, String os, int ram, String screenSize, String processor) {
		super();
		this.battery = battery;
		this.os = os;
		this.ram = ram;
		this.screenSize = screenSize;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Phone [battery=" + battery + ", os=" + os + ", ram=" + ram + ", screenSize=" + screenSize
				+ ", processor=" + processor + ", getBattery()=" + getBattery() + ", getOs()=" + getOs() + ", getRam()="
				+ getRam() + ", getScreenSize()=" + getScreenSize() + ", getProcessor()=" + getProcessor() + "]";
	}

	private int battery;
	private String os;
	private int ram;
	private String screenSize;
	private String processor;

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getRam() {
		return ram;
	}

	public void setRAM(int ram) {
		ram = ram;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

}
