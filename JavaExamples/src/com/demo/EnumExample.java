package com.demo;

enum Colors
{
	GREEN,WHITE,RED,BROWN,BLUE,PINK;
	
	private Colors()
	{
		System.out.println("Enum constructor called .. "+ this.toString());
	}
	
	public void colorInfo()
	{
		System.out.println("Universal color..");
	}
	
}
public class EnumExample {

	public static void main(String[] args) {
  Colors c1 = Colors.BLUE;
  System.out.println(c1);
  c1.colorInfo();
	}

}
