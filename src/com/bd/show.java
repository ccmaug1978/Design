package com.bd;



public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p=new PhoneBuilder().setBattery(3000).setProcessor("Benq").setOS("Android").getphone();
		System.out.println(p);

	}

}
