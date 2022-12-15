package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.google.com/");
	    Thread.sleep(1000);
	    
	   WebElement Honda = driver.findElement(By.name("q"));
	   Honda.sendKeys("Honda");
	    Thread.sleep(1000);
	    
	   

	}

}
