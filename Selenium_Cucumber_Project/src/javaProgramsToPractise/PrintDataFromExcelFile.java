package javaProgramsToPractise;

import java.io.IOException;

import utilities.Excel;

public class PrintDataFromExcelFile {

	static String path = ".\\src\\resources\\Input data.xlsx";

	public static void main(String[] args) throws IOException {
		Excel xl = new Excel();
		@SuppressWarnings("static-access")
		String data = xl.getDataFromExcel(path, "TestInput", 1, 0);
		System.out.println(data);
	}

}
