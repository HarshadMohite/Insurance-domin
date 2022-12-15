package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.google.com/");
	    Thread.sleep(1500);
	    
	   WebElement Honda = driver.findElement(By.name("q"));
	   Honda.sendKeys("Honda");
	    Thread.sleep(1500);
	    
	    List<WebElement> hondaResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	     Thread.sleep(2500);
	     System.out.println(hondaResult.size());
	     
	   
	     for(WebElement hr:hondaResult)
	    {
	    	System.out.println(hr.getText());
	    	
	    	String expected="honda amaze";
	    	String actual=hr.getText();
	    	
	    	if(expected.equals(actual))
	    	{
	    		hr.click();
	    		break;
	    	}
	    	
	     }
	     
	     driver.findElement(By.linkText("Images")).click();
	     List<WebElement> image = driver.findElements(By.tagName("img"));
	     
	     System.out.println(image.size());
	   
	     
	    
	   
	    
	

	}

}
