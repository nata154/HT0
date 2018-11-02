package com.training.epam.Prj02;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.training.epam.Prj02.entity.CatalReader;

public class MainApp {

	public static void main(String[] args) {

		File folder = new File ("d:/МИП хлам/интересное работа/музз/");
//		File folder = new File("d:/чертежи Корнеева/КЖ.3/");

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
/**	Задание 2. Написать каталогизатор mp3-файлов, который сканирует перечень указанных в командной строке каталогов с подкаталогами и создаёт HTML-документ в формате:

		   Исполнитель1
		    Альбом-1
		     Название-1 Длительность-1 (Ссылка на локальный файл)
		     Название-2 Длительность-2 (Ссылка на локальный файл)
		    Альбом-2
		     Название-1 Длительность-1 (Ссылка на локальный файл)
		     Название-2 Длительность-2 (Ссылка на локальный файл)
		   Исполнитель2
		    Альбом-1
		     Название-1 Длительность-1 (Ссылка на локальный файл)
		     Название-2 Длительность-2 (Ссылка на локальный файл)
		    Альбом-2
		     Название-1 Длительность-1 (Ссылка на локальный файл)
		     Название-2 Длительность-2 (Ссылка на локальный файл)

		Также ваша программа должна обнаруживать и формировать два отдельных списка mp3-файлов (и логировать их с помощью Log4j2):
		1)	Полностью идентичных (по контрольной сумме), например:

		Дубликаты-1:
		+ Полный путь к файлу 1.
		+ Полный путь к файлу 2.
		+ Полный путь к файлу 3.

		Дубликаты-2:
		+ Полный путь к файлу A.
		+ Полный путь к файлу B.
		+ Полный путь к файлу C.

		2)	Таких, у которых совпадают исполнитель, альбом и название композиции, даже если сами файлы различаются (контрольные суммы не совпадают), например:

		Исполнитель A, Альбом X, Композиция N:
		+ Полный путь к файлу 1.
		+ Полный путь к файлу 2.
		+ Полный путь к файлу 3.

		Исполнитель B, Альбом Y, Композиция M:
		+ Полный путь к файлу AAA.
		+ Полный путь к файлу BBB.
		+ Полный путь к файлу CCC.
		+ Полный путь к файлу DDD.

			В процессе выполнения этого задания максимальное внимание уделите обработке исключительных ситуаций (на уровне работы с файловой системой, на уровне анализа самих файлов и т.д. и т.п.)
**/
}
