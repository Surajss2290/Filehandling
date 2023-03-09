package com.jspiders.filehandling.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
public static void main(String[] args) {
	File file=new File("Bytestream.txt");
	
	
	if (file.exists()) {
		System.out.println("File is already exist");	
	}else {
		try {
			file.createNewFile();
			System.out.println("file is successfully created");
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			fileOutputStream.write(156);
			fileOutputStream.close();
		} catch (IOException e) {
			System.out.println("File is not created");
			
			e.printStackTrace();
		}
}
}
}
