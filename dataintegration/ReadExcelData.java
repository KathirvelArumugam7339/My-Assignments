package learntestng;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] readData() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/createlead.xlsx");
		XSSFSheet ws = wb.getSheet("sheet1");
		int rowcount = ws.getLastRowNum(); // identify the no. of rows
		int cellcount = ws.getRow(0).getLastCellNum();
		String[][] data = new String[rowcount][cellcount];

		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				String cellvalue2 = ws.getRow(i).getCell(j).getStringCellValue();
				data[i - 1][j] = cellvalue2;

			}
		}
		wb.close();

		return data;

	}

}
