package com.wipro.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class DirExample {

	public static void main(String[] args) {
		File dir = new File("myDir");
		dir.mkdir();

		File myFile = new File(dir,"file2.txt");
		
		try {
			myFile.createNewFile();
			PrintWriter pw = new PrintWriter(myFile);
			pw.print("new stuff");
			pw.flush();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(dir.isDirectory());
		File f=myFile.getParentFile();
		System.out.println(f);
	}

}
