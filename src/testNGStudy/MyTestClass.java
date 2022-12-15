package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void zerodhaLogin() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://kite.zerodha.com/");  
	  
  }
  
  @Test
  public void upStoxLogin() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://login-v2.upstox.com");  
	  
  }
}
