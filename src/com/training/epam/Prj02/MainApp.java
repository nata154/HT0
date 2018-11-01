package com.training.epam.Prj02;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.training.epam.Prj02.entity.CatalReader;

public class MainApp {

	public static void main(String[] args) {

//		File folder = new File ("d:/МИП хлам/интересное работа/музз/");
		File folder = new File ("d:/чертежи Корнеева/КЖ.3/");

		
		CatalReader catalReader = new CatalReader();
		List<File> result = new ArrayList<File>();
		List<File> resultMP3 = new ArrayList<File>();
		
		result = catalReader.readCatalogue(folder);
//		catalReader.printCatalogue(result);
		
		resultMP3 = catalReader.compareMP3(result);
		catalReader.printCatalogue(resultMP3);
	}

}
