package realtimeproject2;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataClass {
	
	public static String getData(int row, int column) throws Exception {
		
		FileInputStream input = new FileInputStream("./TestData/DataExcelApache.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		
		XSSFSheet sheet = workbook.getSheet("Sheet");
		
		String value = sheet.getRow(row).getCell(column).getStringCellValue();
		
		workbook.close();
		
		return value;
		
		
	}

}
