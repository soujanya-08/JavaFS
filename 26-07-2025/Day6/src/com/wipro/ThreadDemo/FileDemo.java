package com.wipro.ThreadDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		String inputFile = "D://FileDemo.txt";
		String outputFile = "D://FileDemoOutput.txt";
		try {
			FileInputStream fi = new FileInputStream(inputFile);
			FileOutputStream fo = new FileOutputStream(outputFile);
			byte[] buffer = new byte[1024];
			int byteRead =0;
			
			while((byteRead = fi.read(buffer))!= -1) {
				fo.write(buffer,0,byteRead);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
