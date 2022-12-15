package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.discoveryplus.in/");
        
        WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(15000));
     //   w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"))));
        
        WebElement locater = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));
	    
       locater.click();
	
	}

}
