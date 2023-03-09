package com.jspiders.filehandling.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamRead {
	public static void main(String[] args) {
		
		File file=new File("Bytestream.txt");
		if (file.exists()) {
		try {
			FileInputStream fileInputStream=new FileInputStream(file);
			System.out.println("Reading Data From File");
			
			try {
				System.out.println(fileInputStream.read());
				fileInputStream.close();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
			
		}
		else {
			System.out.println("file does not exitst");
		}
	}

}
