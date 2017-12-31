package com.pract;

public class ABC {
	private int i=10;
	protected int j=20;
	final int k=30;
	static int l=40;
	
	
	public int get(){
		return k;
		
	}

}

class main1{
	
	public static void main(String[] args)
	{
		ABC a=new ABC();
		System.out.println(a.get());
	}
}
