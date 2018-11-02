package com.training.epam.Prj02.entity;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CatalReader {

	Queue<File> fileTree = new PriorityQueue<>();
	List<File> result = new ArrayList<>();
	List<File> resultMP3 = new ArrayList<>();
//	List<File> listOfFiles = new ArrayList<>();
	Queue<File> listOfFiles = new PriorityQueue<>();
	Song song = new Song();

	public void doFolderExist(File folder) {
		if (folder.exists()) {
			System.out.println("Yes, this file exists! ");
		} else {
			System.out.println("No, this file don't exist! ");
		}
	}
	//

	public void doFolderFileOrDirectory(File folder) {
		if (folder.isFile()) {
			System.out.println("It is a file!");
		} else if (folder.isDirectory()) {
			System.out.println("It is a directory!");
		}
	}

	public List<File> readCatalogue(File folder) {
		Collections.addAll(fileTree, folder.listFiles());

		while (!fileTree.isEmpty()) {
			File currentFile = fileTree.remove();
			if (currentFile.isDirectory()) {
				Collections.addAll(fileTree, currentFile.listFiles());
			} else {
				result.add(currentFile);
			}
		}
		return result;
	}

	public void printCatalogue(List<File> result) {
		for (File entry : result) {
			System.out.println(entry);
		}
	}
	
	public List<File> findMP3(List<File> result) {
		String extension = "";
		String mp3 = new String("mp3");
		int x;
		int y;
		for (File entry : result) {
			x = entry.toString().lastIndexOf('.');
			y = Math.max(entry.toString().lastIndexOf('/'), entry.toString().lastIndexOf('_'));
			if (x > y) {
				extension = entry.toString().substring(x + 1);
				if (extension.equals(mp3)) {
					resultMP3.add(entry);
				} else {
					System.out.println("File doesn't have required extension!");
				}
			}
//			printCatalogue(resultMP3);
		}
		return resultMP3;
	}

//	public List<File> findMP3(List<File> result) {
//		Collections.addAll(listOfFiles);
//		for (File entry : listOfFiles) {
////			File currentFile2 =  listOfFiles.remove();
//			if (entry.equals("*.mp3")) {
//				// Collections.addAll(listOfFiles, entry);
//				result2.add(entry);
//			} 	else {
//				System.out.println("List is empty");
//			}
//		}
//		return result2;
//	}

//	public List<File> findMP3(List<File> result) {
//		for (File entry : result) {
//			File currentFile2 = entry.remove();
//			if (entry.toString().equals("*.mp3")) {
//				// Collections.addAll(listOfFiles, entry);
//				listOfFiles.add(entry);
//			} else {
//				continue;
//			}
//		}
//		return listOfFiles;
//	}
}

