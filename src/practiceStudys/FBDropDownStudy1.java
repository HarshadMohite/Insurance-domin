package practiceStudys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBDropDownStudy1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(1500);
        
        driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
        Thread.sleep(1500);
        
        
        // 1) =============For DAY =================
        List<WebElement> dayList = driver.findElements(By.id("day"));
        
        System.out.println(dayList.size());
        
         // to get day list by using trsversing 
        
        for(WebElement d:dayList)
        {
             System.out.println(d.getText());
        }
        
        // 2) =============For month =================
 
 List<WebElement> monthList = driver.findElements(By.id("month"));
        
        System.out.println(monthList.size());
        
         // to get day list by using trsversing 
        
        for(WebElement m:monthList)
        {
             System.out.println(m.getText());
        }
        
	}
	}


