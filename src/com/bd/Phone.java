package com.bd;

public class Phone {
	private String OS;
	private int Ram;
	private int Battery;
	private String Processor;
	private double screensize;
	public Phone(String oS, int ram, int battery, String processor,
			double screensize) {
		super();
		OS = oS;
		Ram = ram;
		Battery = battery;
		Processor = processor;
		this.screensize = screensize;
	}
	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", Ram=" + Ram + ", Battery=" + Battery
				+ ", Processor=" + Processor + ", screensize=" + screensize
				+ "]";
	}
	
	
	
	
}
