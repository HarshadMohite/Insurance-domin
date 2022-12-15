package practiceStudys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone14Images {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.google.com/");
	    Thread.sleep(1500);
	    
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14");
	    Thread.sleep(1300);
	     
	    List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	    Thread.sleep(1300);
        System.out.println(result.size()); 
        
        driver.findElement(By.name("btnK")).click();
	    Thread.sleep(1300);
	    
	    driver.findElement(By.linkText("Images")).click();
	    Thread.sleep(1300);
	    
	    List<WebElement> image = driver.findElements(By.tagName("img"));
	    System.out.println("images on webpage is "+image.size());
	    


        
        
         
         
	    
	}

}
