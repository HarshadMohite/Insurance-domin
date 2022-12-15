package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptForSendKeyOrClick {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com/");
        Thread.sleep(4000);
        
        //for send info
        WebElement infoSearch= driver.findElement(By.name("q"));
       
       JavascriptExecutor js = ((JavascriptExecutor)driver);
     js.executeScript("arguments[0].value='Softwear testing';",infoSearch);

     Thread.sleep(2000);

     //for click
     WebElement searchButton = driver.findElement(By.name("btnK"));
     
     js.executeScript("arguments[0].click();",searchButton);
	}


	

	
	}


