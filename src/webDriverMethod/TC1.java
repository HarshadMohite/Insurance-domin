package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.amazon.in/");
	       Thread.sleep(800);

	       String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\r\n";
	       	
	       String actualTitle=driver.getTitle();
	       
	       if(expectedTitle.equals(actualTitle))
	       {
	    	   System.out.println("Title is Matching TC is passed");
	       }
	       else
	       {
	    	   System.out.println("Title is not Matching TC is failed");
	       }
	       driver.close();
	}

}
