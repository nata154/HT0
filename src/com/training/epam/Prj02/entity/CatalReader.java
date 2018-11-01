package com.training.epam.Prj02.entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CatalReader {
	
	public static void main(String[] args) throws IOException {

//		//объект существует?
//	File folder = new File("d:/МИП хлам/интересное работа/музз/");
//	
//	if (folder.exists()) {
//		System.out.println("Yes, this file exists! ");
//	}
//	else {
//		System.out.println("No, this file don't exist! ");
//	}
//	
//	
//	//это файл или каталог
//	if (folder.isFile()) {
//		System.out.println("It is a file!");
//	}
//	else if (folder.isDirectory()) {
//		System.out.println("It is a directory!");
//	}
	
		//чтение папки
	File folder = new File ("d:/МИП хлам/интересное работа/музз/");
	Queue<File> fileTree = new PriorityQueue<>();
	List<File> result = new ArrayList<>();
	Collections.addAll(fileTree, folder.listFiles());
	
	while (!fileTree.isEmpty()) { 
		File currentFile = fileTree.remove(); 
		if(currentFile.isDirectory()){ 
			Collections.addAll(fileTree, currentFile.listFiles()); 
			} else { 
				result.add(currentFile); 
				} 
		}
	
	for (File entry: result) {
//		System.out.println(entry);
		}
		
	
	System.out.println();
//	String bytes;
//	String content;
	Queue<File> listOfFiles = new PriorityQueue<>();
	
	for (File entry: result) {
		if (entry.toString().equals("*.mp3")) {
			Collections.addAll(listOfFiles, entry);
		}
		}
	
	for (File entry: listOfFiles) {
		System.out.println(entry);
		}
	
		
//	String processFilesFromFolder(File folder1) {
//	for (File entry: listOfFiles) {
//		if (entry.isDirectory()) {
//			processFilesFromFolder(entry); 
//			continue;
// 						} 
//					// иначе вам попался файл, обрабатывайте его! 
//				else{
//			if (folder1.isFile()) {
//			System.out.println("File = " + folder1.getName());
//	}
//	}
//	}
//	}
	
		
//		//создание html документа
//		PrintWriter pw = new PrintWriter(new FileWriter("C:/test.html"));
//		pw.println("<TABLE BORDER><TR><TH>Name<TH>Playing time<TH>Link</TR>");
//			pw.println("<TR><TD>" + directoryItem.getName() + "<TD>" + directoryItem.length() + "<TD>" + directoryItem.getAbsolutePath());
//
//		
//		pw.println("</TABLE>");
//		pw.close();
		
		



	
}
}


