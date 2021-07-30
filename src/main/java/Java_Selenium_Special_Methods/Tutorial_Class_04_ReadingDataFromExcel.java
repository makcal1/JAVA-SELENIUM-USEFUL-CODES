package Java_Selenium_Special_Methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class Tutorial_Class_04_ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C://Users//muham//Desktop//New Microsoft Excel Worksheet.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sayfa1");  // proveding sheet name

		int rowcount =sheet.getLastRowNum(); // returns the row count

		int colcount=sheet.getRow(0).getLastCellNum(); // returns column/cell count

		for(int i=0; i<rowcount;i++)
		{

			XSSFRow currentrow=	sheet.getRow(i); // focused on current row



			for(int j=0; j<colcount; j++)
			{
				String value=currentrow.getCell(j).toString();
				System.out.println(" " + value);
			}

		}
		System.out.println();
	}
}
