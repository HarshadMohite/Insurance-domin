package practiceStudys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionCopypastEG1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(1500);
       
        Actions act=new Actions(driver);
        
        WebElement createNewAc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        act.click(createNewAc).perform();
        Thread.sleep(3000);
        
        WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
        
        WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
        
        act.moveToElement(fName).sendKeys("Harshad").build().perform();
        Thread.sleep(500);
     
        act.keyDown(fName,Keys.CONTROL).sendKeys("a").build().perform();
       act.sendKeys("c").perform();
       Thread.sleep(500);
       
       act.keyDown(lName,Keys.CONTROL).sendKeys("v").build().perform();

        
        
        
        
 

	}

}
