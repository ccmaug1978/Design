package com.bd;

public class PhoneBuilder {
	
	private String OS;
	private int Ram;
	private int Battery;
	private String Processor;
	private double screensize;
	
	
	public PhoneBuilder setOS(String oS) {
		this.OS = oS;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.Ram = ram;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.Battery = battery;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.Processor = processor;
		return this;
	}
	public PhoneBuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	@Override
	public String toString() {
		return "PhoneBuilder [OS=" + OS + ", Ram=" + Ram + ", Battery="
				+ Battery + ", Processor=" + Processor + ", screensize="
				+ screensize + "]";
	}
	
	public Phone getphone()
	{
		return new Phone(OS, Ram, Battery, Processor, screensize);
	}
	
	
    	

}
