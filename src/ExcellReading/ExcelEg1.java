package ExcellReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		//Create file class object and add excel sheet path along with file name and extension
		File myFile=new File("C:\\Software Testing class\\MyBooK1.xlsx");

		String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value1);
		
		boolean value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
		System.out.println(value2);
		
		double value3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(value3);
		
		String value4 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
        System.out.println(value4);
        
        
        
        
        
        
        boolean value5 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(5).getCell(1).getBooleanCellValue();
		System.out.println(value5);
	}

}
