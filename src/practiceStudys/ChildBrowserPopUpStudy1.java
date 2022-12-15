package practiceStudys;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUpStudy1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.w3schools.com/jsref/obj_console.asp\r\n");
        Thread.sleep(1200);
        
        //new window open 1
        driver.findElement(By.linkText("Pro")).click();
        Thread.sleep(1000);
       
        // again new window open 2
        driver.findElement(By.linkText("Get Certified")).click();
        Thread.sleep(1000);

        //for changing selenium focus we need to get IDs of windows
        Set<String> idOfWindows = driver.getWindowHandles();
        System.out.println(idOfWindows);
        
        Iterator<String> it = idOfWindows.iterator();
        String mainPageId = it.next();
        String fristWindowId = it.next();
        String secondWindowID = it.next();
        
        //now switching focus from main page to 2nt tab window
        driver.switchTo().window(fristWindowId);
        driver.findElement(By.name("q")).sendKeys("java");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        
       //now switching focus from 2nd tabwindow to 1st tabwindow
         driver.switchTo().window(secondWindowID);
         String myText = driver.findElement(By.xpath("//h1[text()='Become a PRO User']")).getText();
        System.out.println("Frist page text is "+myText);
        
        //now switching focus from 1st tabwindow to main page
        driver.switchTo().window(mainPageId);
        String text = driver.findElement(By.xpath("//h1[text()='Window Console Object']")).getText();
       System.out.println("Main page text is "+text);
 
        
        
	}

}
