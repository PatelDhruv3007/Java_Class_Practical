package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInptuOutputDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("dhruv.txt");
		String s = "This is file input/Output data using java.";
		byte b[] = s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File writen Sucessfully");
		
		FileInputStream fis = new FileInputStream("dhruv.txt");
		int i ;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}
}
