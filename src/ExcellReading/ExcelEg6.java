package ExcellReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
       File myFile=new File("C:\\Software Testing class\\MyBooK1.xlsx");
       
       Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");

       int totalNoOfRows = mySheet.getLastRowNum();
       
       int totalNumberOfCell = mySheet.getRow(0).getLastCellNum()-1;
       
       //for loop
       //Outter for loop-->rows
       
       for(int i=0;i<=totalNoOfRows;i++)
       {
    	   //inter for loop-->cells
    	   for(int j=0;j<=totalNumberOfCell;j++)
    	   {
    		   CellType dataType = mySheet.getRow(i).getCell(j).getCellType();
    		   
    		   if(dataType==CellType.STRING)
    		   {
    			   String value = mySheet.getRow(i).getCell(j).getStringCellValue();
    			   System.out.print(value+" ");
    		   }
    		   else if(dataType==CellType.NUMERIC)
    		   {
    			    double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
    			   System.out.print(value+" ");
    			   
    		   }
    		   else if(dataType==CellType.BLANK)
    		   {
    			 System.out.println();  // give blank space in empty box
    		   }
    		   else if(dataType==CellType.BOOLEAN)
    		   {
    			    boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
    			   System.out.print(value+" ");
    			   
    		   }
    		   
    	   }
    	   System.out.println();
    	   
    	   
    	   
    	   
       }
     
     
     
     
     
     
	}

}
