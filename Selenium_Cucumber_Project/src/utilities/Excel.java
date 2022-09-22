package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	static FileInputStream fis = null;
	static XSSFWorkbook wb = null;
	static XSSFSheet sh = null;
	static XSSFRow row = null;
	static XSSFCell cell = null;

	private static void setPathToExcelFile(String filePath) throws FileNotFoundException {
		fis = new FileInputStream(filePath);
	}

	public static String getDataFromExcel(String filePath, String sheetName, int rowNum, int columnNum)
			throws IOException {
		setPathToExcelFile(filePath);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(sheetName);
		row = sh.getRow(rowNum);
		cell = row.getCell(columnNum);
		return cell.getStringCellValue();
	}

	public void setDataToExcel(String filePath, String sheetName, int rowNum, int columnNum, String value)
			throws FileNotFoundException {
		setPathToExcelFile(filePath);
		sh = wb.getSheet(sheetName);
		row = sh.getRow(rowNum);
		cell = row.getCell(columnNum);
		cell.setCellValue(value);
	}
}