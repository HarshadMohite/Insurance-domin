package Upstox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://login-v2.upstox.com");
        Thread.sleep(2000);
        
        driver.findElement(By.name("userId")).sendKeys("CS8981");
        driver.findElement(By.name("password")).sendKeys("Harshad@123");
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("yob")).sendKeys("1995");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
        Thread.sleep(3000);
        
        String actualUN = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();

        String expectedUN="Harshad M.";
        
        //Validating Actual and Expected User name
        if(actualUN.equals(expectedUN))
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
