package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassEg2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(2000);
        
        Actions act=new Actions(driver);
        
        WebElement refElement = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
       
        //Double click 
        //OP-->1)
//        act.moveToElement(refElement).perform();
//        act.doubleClick().perform();
        
        //OP-->2)
//        act.moveToElement(refElement).doubleClick().build().perform();

        //OP-->3)
//        act.doubleClick(refElement).perform();
          
          
         // Context Clicl--(Right click);
          WebElement ref = driver.findElement(By.xpath("//span[text()='right click me']"));
        
        //OP-->1)
//          act.moveToElement(ref).perform();
//          act.contextClick().perform();
        
          //OP-->2)
//           act.moveToElement(ref).contextClick().build().perform();
          
          //OP-->3)
             act.contextClick(ref).perform();

          
          
	}

}
