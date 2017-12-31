package com.fd;

public class FactoryDesign {
	
	public OS getinstance(String str)
	{
		if( str.contains("Open"))
			return new Android();
		else if ( str.contains("Secure"))
			return new IOS();
		else 
			return new Windows();
		 
		 
	}

}
