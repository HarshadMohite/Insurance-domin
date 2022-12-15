package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1200);
        
        // Print data from table by findElements
        
       List<WebElement> myText = driver.findElements(By.xpath("//table[@id='product']//tr"));
        for(WebElement m:myText)
        {
        	System.out.print(m.getText()+"   ");
        	System.out.println();
        }
        

	}

}
