package iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.switchTo().frame("courses-iframe"); //switching selenium focus from main page to iframe.
        String myText = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity')]")).getText();
        System.out.println(myText);
        driver.switchTo().defaultContent(); ////switching selenium focus from iframe to main page.

        String myText1 = driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate')]")).getText();
        System.out.println(myText1);
        
	}

}
