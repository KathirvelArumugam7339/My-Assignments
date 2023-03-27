package learntestng;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public static void main(String[] args) throws IOException {
		// identify the excel file
		XSSFWorkbook wb = new XSSFWorkbook("./data/createlead.xlsx");
		// identify the sheet
		XSSFSheet ws = wb.getSheet("sheet1");
		int rows = ws.getLastRowNum();		// identify the no. of rows
		int columns = ws.getRow(0).getLastCellNum();
		System.out.println(columns); 
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < columns; j++) {

				String cellvalue2 = ws.getRow(i).getCell(j).getStringCellValue();  
				System.out.println(cellvalue2);

			}
		}

	}

}
