package com.jspiders.filehandling.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamread {

	public static void main(String[] args) {
		File file=new File("charstream.txt");
		
		if (file.exists()) {
			
			try {
				FileReader fileReader=new FileReader(file);
				try {
					System.out.println("File output "+fileReader.read());
					Scanner scanner=new Scanner(file);
					System.out.println("scanner output");
					
					while (scanner.hasNextLine()) {
						System.out.println(scanner.nextLine());
						
					}
					scanner.close();
					fileReader.close();
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			
		}
		else {
			System.out.println("file does not exist");
		}
	}

}
