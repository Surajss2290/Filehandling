package com.jspiders.filehandling.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Charstreamwrite {
public static void main(String[] args) {
	File file=new File("charstream.txt");
	
	if (file.exists()) {
		System.out.println("File already exist");
	}
	else {
		try {
			file.createNewFile();
			System.out.println("File created");
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("HEYY MY SELF SURAJ");
			System.out.println("data written to file ");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("file is not created");
			
			e.printStackTrace();
		}
		
	}
}
}
