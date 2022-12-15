package Upstox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://login-v2.upstox.com");
        Thread.sleep(2000);
        
        File myFile=new File("C:\\Software Testing class\\MyBooK1.xlsx");
        Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
        
        String uN = mySheet.getRow(0).getCell(0).getStringCellValue();
        WebElement userName = driver.findElement(By.name("userId"));
        userName.sendKeys(uN);
         
        //String pW = mySheet.getRow(0).getCell(1).getStringCellValue();
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(mySheet.getRow(0).getCell(1).getStringCellValue());
        
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(2000);
        
       // String yob= mySheet.getRow(0).getCell(2).getStringCellValue();
        WebElement yearOfBirth = driver.findElement(By.id("yob"));
        yearOfBirth.sendKeys(mySheet.getRow(0).getCell(2).getStringCellValue());
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
        Thread.sleep(2000);
 
        String actualUn = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
       
        String expectedUn="Harshad M.";
        
        // //Validating Actual and Expected User name
        if(actualUn.equals(expectedUn))
        {
        	System.out.println("Usename matching TC is Pass");
        }
        else
        {
        	System.out.println("Usename Not matching TC is Failed");

        }
        
        //Check Funds
        driver.findElement(By.id("funds")).click();
        Thread.sleep(2000);
        
        String myFund = driver.findElement(By.xpath("(//div[@class='_2Bthrplw1VYHfLzzQv0asZ']//div)[3]")).getText();
		System.out.println("Fund Available to trade is "+myFund);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
