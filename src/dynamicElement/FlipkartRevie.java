package dynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartRevie {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/");
        Thread.sleep(1200);
        
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

        driver.findElement(By.name("q")).sendKeys("I phone 14 pro max");
        Thread.sleep(200);
        
         driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
         Thread.sleep(3000);
         
         String myText = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
         System.out.println(myText);
        
        
	}

}
