package practiceStudys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownStudy {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(1500);
        
        driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
        Thread.sleep(1500);
        
        // 1)=======FoR DAY============
        // find drop box of day
        WebElement dayList = driver.findElement(By.id("day"));
        
        // create  object of select class
        Select s= new Select(dayList);
        
        // create object of  list options
       List<WebElement> dayOption = s.getOptions();
        
        // to print day by using traversing 
        for(WebElement d:dayOption)
        {
        	System.out.println(d.getText());
        }
        
        
      System.out.println("===========================");  
        // 2)========= FOR MONTH=============
        // find drop box of momth
        WebElement monthList = driver.findElement(By.id("month"));
        
        // create  object of select class
        Select s1= new Select(monthList);
        
        // create object of  list options
       List<WebElement> monthOption = s1.getOptions();
        
        // to print day by using traversing 
        for(WebElement m:monthOption)
        {
        	System.out.println(m.getText());
        }

	}

}
