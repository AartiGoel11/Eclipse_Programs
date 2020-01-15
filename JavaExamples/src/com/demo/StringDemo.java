package com.demo;

//import java.util.Scanner;
interface Parent {  }
class Child implements Parent { }

public class StringDemo {

	    public static void main(String[] args)
	    {
	        // Reference is Parent type but object is
	        // of child type.
	        Parent cobj = new Child();
	        if (cobj instanceof Child)
	           System.out.println("cobj is instance of Child");
	        else
	           System.out.println("cobj is NOT instance of Child");
	        
	        if (cobj instanceof Parent)
		           System.out.println("cobj is instance of Parent");
		        else
		           System.out.println("cobj is NOT instance of Parent");
	    }
	}
		
	



