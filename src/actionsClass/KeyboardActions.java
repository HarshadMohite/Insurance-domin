package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(1200);
        
        Actions act=new Actions(driver);
        
        WebElement userName = driver.findElement(By.id("email"));
        
        //sendKeys use
        //Op-->1)
    //    act.moveToElement(userName).sendKeys("Harshad").build().perform();
        
        //Op-->2)
       act.sendKeys(userName, "Mohite").perform();
       
       WebElement creatNewact = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        
       act.click(creatNewact).perform();
       Thread.sleep(1200);
       
       WebElement day = driver.findElement(By.id("day"));
       act.click(day).perform();
       Thread.sleep(1200);
       
//       act.sendKeys(Keys.ARROW_UP).perform();
//       Thread.sleep(600);
//       act.sendKeys(Keys.ARROW_UP).perform();
//       Thread.sleep(600);
//       act.sendKeys(Keys.ARROW_UP).perform();
//       Thread.sleep(600);
//       act.sendKeys(Keys.ARROW_UP).perform();
//       Thread.sleep(600);
//       act.sendKeys(Keys.ARROW_UP).perform();
//       Thread.sleep(600);
//       act.sendKeys(Keys.ARROW_UP).perform();
//       Thread.sleep(600);
//       act.sendKeys(Keys.ARROW_UP).perform();
//       Thread.sleep(600);
//       act.sendKeys(Keys.ARROW_UP).perform();
//       Thread.sleep(600);
//       act.sendKeys(Keys.ENTER).perform();


        for(int i = 1;i<=8;i++)
        {
        	Thread.sleep(600);
        	act.sendKeys(Keys.ARROW_UP).perform();
        }
        act.sendKeys(Keys.ENTER).perform();
        
        WebElement firstName = driver.findElement(By.name("firstname"));
        act.keyDown(firstName,Keys.SHIFT).sendKeys("Harshad").build().perform();
       
       

	}

}
