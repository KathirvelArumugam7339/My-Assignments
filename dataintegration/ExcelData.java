package leaftaps;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	public static String[][]excelData() throws IOException{
	
		XSSFWorkbook wb=new XSSFWorkbook("./data/Createleaddetails.xlsx");
		XSSFSheet ws = wb.getSheet("sheet1");
		int lastRowNum = ws.getLastRowNum();
		int lastCellNum = ws.getRow(0).getLastCellNum();
		String[][] data=new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;
			}
			
		}
		wb.close();
		
		return data;
		
	}

}
