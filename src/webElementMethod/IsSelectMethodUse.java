package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectMethodUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
        WebElement CBOption1 = driver.findElement(By.id("checkBoxOption1"));
        System.out.println(CBOption1.isSelected());
        
        CBOption1.click();
        System.out.println(CBOption1.isSelected());

	}

}
