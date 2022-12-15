package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKyesUse {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.amazon.in/");
	       
	       driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Cargo perfume");
	       Thread.sleep(1500);
       
	       driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	       Thread.sleep(1500);
	       
	       driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung m42 mobile");
	       Thread.sleep(1500);

	       driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	       Thread.sleep(1500);
	       
	       driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
           Thread.sleep(1500);
           
	       driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();

	       
       
       
       
       
       
       
	}

}
