package serialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest1 {
  @Test
  public void paytm() 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
      driver.manage().window();
      driver.get("https://paytm.com/login");
  
  
  }
}
