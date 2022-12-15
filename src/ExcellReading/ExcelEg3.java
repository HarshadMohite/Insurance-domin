package ExcellReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Software Testing class\\MyBooK1.xlsx");
        
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//How to read whole row from Excel
		for(int i=0;i<=3;i++)
		{
			String value = mySheet.getRow(2).getCell(i).getStringCellValue();
			System.out.print(value+" ");
			
		}
	
		System.out.println();
		System.out.println("================================");
		
		//How to read whole column/cell from Excel

		  for(int j=2;j<=3;j++) 
		  {
		      String value1 = mySheet.getRow(j).getCell(0).getStringCellValue();
		      System.out.println(value1);
		   
		  }
		
		

	}

}
