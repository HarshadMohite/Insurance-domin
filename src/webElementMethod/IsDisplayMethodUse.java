package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayMethodUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
	    Thread.sleep(1000);
	   
	    WebElement textBox = driver.findElement(By.id("displayed-text"));
	    
	    System.out.println(textBox.isDisplayed());
	    
	    textBox.sendKeys("My name is Harshad");
	    Thread.sleep(1000);
	    textBox.clear();
	    Thread.sleep(500);
	      
	    driver.findElement(By.id("hide-textbox")).click();
	     
	    if(textBox.isDisplayed())
	    {
	    	textBox.sendKeys("Hey Good Night");
	    }
	    else
	    {
    	   System.out.println("textbox is not displayed please check");
	    }
	    
	}

}
