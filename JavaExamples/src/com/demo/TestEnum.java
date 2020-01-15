package com.demo;import java.awt.Color;

enum ColorTest
{
	GREEN,WHITE,BLUE,GOLDEN,PINK;
}
public class TestEnum {

	public static void main(String[] args) {
		
		ColorTest[] arr = ColorTest.values();
		for(ColorTest c :arr)
		{
			System.out.println(c+" index at "+c.ordinal());
		}
		
	//	ColorTest str = ColorTest.BLUE;
		System.out.println(ColorTest.valueOf("WHITE"));

	}

}
