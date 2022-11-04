package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	

	public static void main(String[] args) throws IOException {
		String value = ReadExcelXFileNew(0, 0);
		System.out.println(value);
	}

	public static String ReadExcelXFileNew(int a, int b) throws IOException {
		FileInputStream fis = new FileInputStream(new File(
				System.getProperty("user.dir")+"\\src\\main\\resources\\excel12.xlsx"));
//filepath 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
//wrkbook creation
		XSSFSheet sheet = wb.getSheetAt(0);// sheetcreation

		XSSFRow sh = sheet.getRow(a);
		XSSFCell cell = sh.getCell(b);
		
		switch (cell.getCellType()) {
		case NUMERIC:

			double num = cell.getNumericCellValue();
			String value = Double.toString(num);
			return value;
		case STRING:
			return cell.getStringCellValue();
		}
		return null;
	}
		
}
