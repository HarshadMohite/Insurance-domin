package practiceStudys;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FbDropDownStudy2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(1500);
        
        driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
        Thread.sleep(1500);
        
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harshad");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mohite");
       driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8390998807");
       driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123@456");
    
        
       // ===========FOR DAY=============
        WebElement daylist = driver.findElement(By.id("day"));
       // create an object of seletc class which is accept webelement as arrgument
        Select s=new Select(daylist);
        s.selectByIndex(5);
        
        // ===========FOR MOnth=============
        WebElement monthlist = driver.findElement(By.id("month"));
       // create an object of seletc class which is accept webelement as arrgument
        Select s1=new Select(monthlist);
        s1.selectByValue("1");
        
        // ===========FOR year=============
        WebElement yearlist = driver.findElement(By.id("year"));
       // create an object of seletc class which is accept webelement as arrgument
        Select s2=new Select(yearlist);
        s2.selectByValue("1995");
        
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        
        
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Software Testing class\\my Screenshot\\Fb.png");
        
        FileHandler.copy(src, dest);
        



	}

	
}
