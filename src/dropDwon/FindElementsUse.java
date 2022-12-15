package dropDwon;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUse 
{
    public static void main(String[] args) throws InterruptedException 
    {

		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com/");
        Thread.sleep(1500);
        
        // to fine how may links are present in there webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        
        
         // to print available links by using traversing
        
          Iterator<WebElement> it = links.iterator();
          
          while(it.hasNext())
          {
        	  System.out.println(it.next().getText());
          }
    
    
    
    }
}

