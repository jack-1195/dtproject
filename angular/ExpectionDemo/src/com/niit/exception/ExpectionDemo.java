package com.niit.exception;

public class ExpectionDemo {
	public double divide(int x ,int y)
	{
		
			return x/y;
		
	}
	 
	
	public static void main(String[] args){
		ExpectionDemo e= new ExpectionDemo();
	
		int x= Integer .parseInt(args [0]);
		int y= Integer .parseInt(args[1]);
		System.out.println(x/y);
	}

}
