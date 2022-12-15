package ExcellReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Software Testing class\\MyBooK1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//How to read whole data from Excel
		//vary rows-->vary cells
		// outter for loop rows-->varying from 2--3
     
		for(int i=2;i<=3;i++)
		{
			//inner loop for cells varying from 0--3
			for(int j=0;j<=3;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
			
		}

	}

}
