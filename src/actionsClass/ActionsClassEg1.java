package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        
        // Mouse action move to Element
        //1) Create Object of Actions class and pass driver as an Argument
        Actions act=new Actions(driver);
        
        //2) By using one of the actions class methods perform required actions
        Thread.sleep(2500);
       WebElement refElement = driver.findElement(By.xpath("//a[text()=' 5000']"));
        
        // Click method-->
        // OP--1)
      //  act.moveToElement(refElement).perform();
      //  act.click().perform();
      
       // OP--2)
     //  act.moveToElement(refElement).click().build().perform();

       // OP--3)
       act.click(refElement).perform();
       
       
       //Drag and drop method-->
       
       WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
       WebElement target = driver.findElement(By.id("bank"));
       
       //OP-->1)
//       act.moveToElement(source).perform();
//       act.clickAndHold().perform();
//       act.moveToElement(target).perform();
//       act.release().perform();
       
       //OP-->2)
     //  act.moveToElement(source).clickAndHold().release(target).build().perform();
      
       //OP--->3)
       act.dragAndDrop(source, target).perform();
       

	}

} 
