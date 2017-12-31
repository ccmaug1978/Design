package com.fd;

public class phoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OS obj=new Android();
		obj.spec();
		
		FactoryDesign osf=new FactoryDesign();
		OS obj1=osf.getinstance("Secure");
		obj1.spec();

	}

}
