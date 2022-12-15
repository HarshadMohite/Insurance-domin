package ExcellReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Software Testing class\\MyBooK1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		int lastRowNum = mySheet.getLastRowNum();
        System.out.println("Last row Number is "+lastRowNum);
        
        int totalNoOfRows = lastRowNum;
        System.out.println("Total number of rows are "+totalNoOfRows);
        
        short lastCellNumber = mySheet.getRow(0).getLastCellNum();
        System.out.println("Last cell number is "+lastCellNumber);
        
        int totalNumberOfCell = lastCellNumber-1;
        System.out.println("Total Number of cells are "+totalNumberOfCell);
        
        //for loop
        
        //OUTTER FOR LOOP-->rows
        for(int i=0;i<=totalNoOfRows;i++)
        {
        	//Inner for loop--> cells
        	for(int j=0;j<=totalNumberOfCell;j++)
        	{
        		String myValue = mySheet.getRow(i).getCell(j).getStringCellValue();
        		System.out.print(myValue+" ");
        	}
        	System.out.println();
        	
        	
        }
        

	}

}
