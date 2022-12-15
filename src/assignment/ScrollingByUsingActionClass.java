package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollingByUsingActionClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
      
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
    
        Dimension windowsize = driver.manage().window().getSize(); // here get dimentions by window
        System.out.println(windowsize);
       
        // scrolling by using action class
        Actions act=new Actions(driver);
 
        act.scrollByAmount(0, 500).perform();
        Thread.sleep(2000);
         
        WebElement text = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
        act.scrollToElement(text).perform();
        
        
        
	}

}
