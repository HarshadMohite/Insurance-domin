package verificationUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing {
  @Test
  public void verifyCheckBoxStatus() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Software Testing class\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
    driver.manage().window();
    driver.get("https://vctcpune.com/selenium/practice.html");
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)) ;
	 WebElement checkBox1 = driver.findElement(By.name("checkBoxOption1"));
	 
//	 if(checkBox1.isSelected())
//	 {
//		 Reporter.log("CheckBox is selected TC is Passed",true);
//	 }
//	 else
//	  {
//		 Reporter.log("CheckBox is selected TC is failed",true);
//	  }
	 checkBox1.click();
	 
	 Assert.assertTrue(checkBox1.isSelected(),"Tc is failed check Bpx is not selected");
	 
  }
}
