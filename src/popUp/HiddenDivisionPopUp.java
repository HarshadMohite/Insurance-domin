package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // close the hidden division popup
        
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("I phone 14 pro max");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        

	}

}
