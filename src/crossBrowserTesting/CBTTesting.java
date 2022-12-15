package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTTesting {
  
	  WebDriver driver;
		
		@Parameters("browserName")
		
		@Test
	  public void BrowserTesting(String bName) 
	  {
		 if (bName.equals("chrome"))
		 {
		  System.setProperty("webdriver.chrome.driver", "C:\\Software Testing class\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.manage().window();
	    
		 }
		 else if(bName.equals("firefox"))
		 {
	      System.setProperty("webdriver.grecko.driver", "C:\\Software Testing class\\geckodriver.exe");
	      driver=new FirefoxDriver();
	      driver.manage().window();
		 }
	     
		 driver.get("https://www.instagram.com/");
         driver.manage().window().maximize();
	  
  }
}
