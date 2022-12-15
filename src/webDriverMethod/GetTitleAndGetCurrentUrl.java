package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetCurrentUrl {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.amazon.in/");
	       Thread.sleep(900);
	       
	       System.out.println(driver.getTitle());
	       String myTitle = driver.getTitle();
	       System.out.println("Title of the webpage is "+myTitle);
	       
	      System.out.println(driver.getCurrentUrl());
	      String myUrl = driver.getCurrentUrl();
	      System.out.println("My Current url is "+myUrl);

	}

}
