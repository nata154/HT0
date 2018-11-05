package com.training.epam.Prj02;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.List;

import com.training.epam.Prj02.entity.CatalWorker;
import com.training.epam.Prj02.entity.Song;

public class MainApp {

	public static void main(String[] args) {
	
//		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
//		String path;
//		String insertedArgs;
//		String[] splitInsertedArgs;
//		 try {
//			 System.out.println("Enter one folder: like d:/music");
//			 insertedArgs = reader.readLine();
//			 splitInsertedArgs = insertedArgs.split(" ");
//			 
//				 if (splitInsertedArgs.length==1) {
//					 path = insertedArgs;
//			 } else {
//				 System.out.println("Please, enter one folder again like d:/music"); 
//				 }
//				 
//		File folder = new File (path);
		
		File folder = new File("d:/��� ����/���������� ������/����/");
//		File folder = new File("d:/�������/��.3/");

		CatalWorker catalWorker = new CatalWorker();
		List<File> result = new ArrayList<File>();
		List<Song> resultMP3 = new ArrayList<Song>();
		List<Song> songMP3 = new ArrayList<Song>();

		result = catalWorker.readCatalogue(folder);
		catalWorker.printCatalogue(result);

		resultMP3 = catalWorker.findMP3(result);
//		catalWorker.printCatalogueMP3(resultMP3);
		 catalWorker.writeHTMLCatalogue(resultMP3);
//		 catalWorker.listEqualCount(songMP3);

		// } catch (InvalidPathException e) {
		// e.printStackTrace();
		// }

		/**
		 * ������� 2. �������� ������������� mp3-������, ������� ��������� ��������
		 * ��������� � ��������� ������ ��������� � ������������� � ������
		 * HTML-�������� � �������:
		 * 
		 * �����������1 ������-1 ��������-1 ������������-1 (������ �� ��������� ����)
		 * ��������-2 ������������-2 (������ �� ��������� ����) ������-2 ��������-1
		 * ������������-1 (������ �� ��������� ����) ��������-2 ������������-2 (������
		 * �� ��������� ����) �����������2 ������-1 ��������-1 ������������-1 (������ ��
		 * ��������� ����) ��������-2 ������������-2 (������ �� ��������� ����) ������-2
		 * ��������-1 ������������-1 (������ �� ��������� ����) ��������-2
		 * ������������-2 (������ �� ��������� ����)
		 * 
		 * ����� ���� ��������� ������ ������������ � ����������� ��� ��������� ������
		 * mp3-������ (� ���������� �� � ������� Log4j2): 1) ��������� ���������� (��
		 * ����������� �����), ��������:
		 * 
		 * ���������-1: + ������ ���� � ����� 1. + ������ ���� � ����� 2. + ������ ����
		 * � ����� 3.
		 * 
		 * ���������-2: + ������ ���� � ����� A. + ������ ���� � ����� B. + ������ ����
		 * � ����� C.
		 * 
		 * 2) �����, � ������� ��������� �����������, ������ � �������� ����������, ����
		 * ���� ���� ����� ����������� (����������� ����� �� ���������), ��������:
		 * 
		 * ����������� A, ������ X, ���������� N: + ������ ���� � ����� 1. + ������ ����
		 * � ����� 2. + ������ ���� � ����� 3.
		 * 
		 * ����������� B, ������ Y, ���������� M: + ������ ���� � ����� AAA. + ������
		 * ���� � ����� BBB. + ������ ���� � ����� CCC. + ������ ���� � ����� DDD.
		 * 
		 * � �������� ���������� ����� ������� ������������ �������� ������� ���������
		 * �������������� �������� (�� ������ ������ � �������� ��������, �� ������
		 * ������� ����� ������ � �.�. � �.�.)
		 **/
	}
}