package com.training.epam.Prj02.entity;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CatalReader {

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
		Queue<File> fileTree = new PriorityQueue<>();
		List<File> result = new ArrayList<>();
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

	
	public List<File> compareMP3(List<File> result) {
		Queue<File> listOfFiles = new PriorityQueue<>();

		for (File entry : result) {
			if (entry.toString().equals("*.mp3")) {
				Collections.addAll(listOfFiles, entry);
			}
		}

		for (File entry : listOfFiles) {
			System.out.println(entry);
		}
		return result;
	}
	
}
