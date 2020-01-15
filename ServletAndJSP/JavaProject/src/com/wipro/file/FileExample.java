package com.wipro.file;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		File f = new File("file2.txt");
		try {
		boolean b=	f.createNewFile();
			System.out.println("file is created "+b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
String path=f.getAbsolutePath();
System.out.println(path);
System.out.println("File exists..."+f.exists());
	}

}
