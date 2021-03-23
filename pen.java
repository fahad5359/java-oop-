package jvaa;

public class pen {
	
	
	String color;
	int wight;
	String fast;
	public pen(String clr ,int wgt, String sft){
		
		color=clr;
		wight=wgt;
		fast=sft;
		
	}
	public static void main(String[] args) {
		 
		 pen Mypen=new pen("blue",145,"very fast" );
		 
		 System.out.println(Mypen.color+", "+Mypen.fast+ "," +Mypen.wight);
		 
	 }
	

}
