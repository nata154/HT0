package com.training.epam.Prj02.entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CatalReader {
	
	public static void main(String[] args) throws IOException {

		//объект существует?
	File file = new File("d:/МИП хлам/интересное работа/музз/");
	
	if (file.exists()) {
		System.out.println("Yes, this file exists! ");
	}
	else {
		System.out.println("No, this file don't exist! ");
	}
	
	
	//это файл или каталог
	if (file.isFile()) {
		System.out.println("It is a file!");
	}
	else if (file.isDirectory()) {
		System.out.println("It is a directory!");
	}
	
	File folder = new File ("d:/МИП хлам/интересное работа/музз/");
	File[] listOfFiles = folder.listFiles() ;
	
	for (File directoryItem: listOfFiles) {
		if (directoryItem.isDirectory()) {
			System.out.println("DIR = " + directoryItem.getName());
		}
		if (directoryItem.isFile()) {
			System.out.println("File = " + directoryItem.getName());
	}
		
		
		//создание html документа
		PrintWriter pw = new PrintWriter(new FileWriter("C:/test.html"));
		pw.println("<TABLE BORDER><TR><TH>Name<TH>Playing time<TH>Link</TR>");
			pw.println("<TR><TD>" + directoryItem.getName() + "<TD>" + directoryItem.length() + "<TD>" + directoryItem.getAbsolutePath());

		
		pw.println("</TABLE>");
		pw.close();
	
}
}
}
