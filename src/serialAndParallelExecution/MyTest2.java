package serialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest2 {
  @Test
  public void google() 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
      driver.manage().window();
      driver.get("https://www.google.co.in/");
	  
  }
}
