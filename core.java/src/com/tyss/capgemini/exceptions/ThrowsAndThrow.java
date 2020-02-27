package com.tyss.capgemini.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ThrowsAndThrow {
	public static void main(String[] args) throws IOException {
		Properties properties= new Properties();
		 properties.load(new FileReader("application.properties"));
		 
		 System.out.println(properties.getProperty("Name"));
		 
		 System.out.println("some code...");
	}
}
