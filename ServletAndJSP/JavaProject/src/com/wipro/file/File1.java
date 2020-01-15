package com.wipro.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		char[] in = new char[50];
		int size=0;
		File f= new File("file1.txt");
		try {
			FileWriter fw= new FileWriter(f);
			fw.write("Hello");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(f);
			size=fr.read(in);
			System.out.println("Size of file.."+size);
			for(char c : in)
			{
				System.out.print(c);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
