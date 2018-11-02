package com.training.epam.Prj02;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.training.epam.Prj02.entity.CatalReader;

public class MainApp {

	public static void main(String[] args) {

		File folder = new File ("d:/��� ����/���������� ������/����/");
//		File folder = new File("d:/������� ��������/��.3/");

		CatalReader catalReader = new CatalReader();
		List<File> result = new ArrayList<File>();
		List<File> resultMP3 = new ArrayList<File>();

		result = catalReader.readCatalogue(folder);
		// catalReader.printCatalogue(result);


		 resultMP3 = catalReader.findMP3(result);
		 catalReader.printCatalogue(resultMP3);

//		String extension = "";
//		String mp3 = new String("mp3");
//		int x;
//		int y;
//		for (File entry : result) {
//			x = entry.toString().lastIndexOf('.');
//			y = Math.max(entry.toString().lastIndexOf('/'), entry.toString().lastIndexOf('_'));
//			if (x > y) {
//				extension = entry.toString().substring(x + 1);
//				if (extension.equals(mp3)) {
//					resultMP3.add(entry);
//				}
//			}
//			catalReader.printCatalogue(resultMP3);
//		}
	}
/**	������� 2. �������� ������������� mp3-������, ������� ��������� �������� ��������� � ��������� ������ ��������� � ������������� � ������ HTML-�������� � �������:

		   �����������1
		    ������-1
		     ��������-1 ������������-1 (������ �� ��������� ����)
		     ��������-2 ������������-2 (������ �� ��������� ����)
		    ������-2
		     ��������-1 ������������-1 (������ �� ��������� ����)
		     ��������-2 ������������-2 (������ �� ��������� ����)
		   �����������2
		    ������-1
		     ��������-1 ������������-1 (������ �� ��������� ����)
		     ��������-2 ������������-2 (������ �� ��������� ����)
		    ������-2
		     ��������-1 ������������-1 (������ �� ��������� ����)
		     ��������-2 ������������-2 (������ �� ��������� ����)

		����� ���� ��������� ������ ������������ � ����������� ��� ��������� ������ mp3-������ (� ���������� �� � ������� Log4j2):
		1)	��������� ���������� (�� ����������� �����), ��������:

		���������-1:
		+ ������ ���� � ����� 1.
		+ ������ ���� � ����� 2.
		+ ������ ���� � ����� 3.

		���������-2:
		+ ������ ���� � ����� A.
		+ ������ ���� � ����� B.
		+ ������ ���� � ����� C.

		2)	�����, � ������� ��������� �����������, ������ � �������� ����������, ���� ���� ���� ����� ����������� (����������� ����� �� ���������), ��������:

		����������� A, ������ X, ���������� N:
		+ ������ ���� � ����� 1.
		+ ������ ���� � ����� 2.
		+ ������ ���� � ����� 3.

		����������� B, ������ Y, ���������� M:
		+ ������ ���� � ����� AAA.
		+ ������ ���� � ����� BBB.
		+ ������ ���� � ����� CCC.
		+ ������ ���� � ����� DDD.

			� �������� ���������� ����� ������� ������������ �������� ������� ��������� �������������� �������� (�� ������ ������ � �������� ��������, �� ������ ������� ����� ������ � �.�. � �.�.)
**/
}
