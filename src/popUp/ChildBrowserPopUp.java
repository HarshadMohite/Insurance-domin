package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(1200);
        
        String mainPageId = driver.getWindowHandle();
        System.out.println(mainPageId);
        
        // Cliking on new window button--> will open new child window
        driver.findElement(By.name("NewWindow")).click();
        
        // for change focus on new window Need to windows Id
        Set<String> allPageId = driver.getWindowHandles();
        System.out.println(allPageId);
        
        //traversing in set of string
        Iterator<String> it = allPageId.iterator();
        
        //Pring of all Ids
        String idOfMainPage = it.next();
        String idOfChildPage = it.next();
        
        // we need to change focus from main page to child page
        driver.switchTo().window(idOfChildPage);
        
        driver.manage().window().maximize();
        
        //driver.close();
       // driver.quit();
        
       // current focus is on child page--> so action is take place on child page now
        driver.findElement(By.id("the7-search")).sendKeys("Hey Good Morning");
        Thread.sleep(5000);
        
        // if we want to do action again on page  we have to switch focus from child page to main page
        driver.switchTo().window(idOfMainPage);
        String myText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
        
        System.out.println("main page text is "+myText);
        
	}

}
