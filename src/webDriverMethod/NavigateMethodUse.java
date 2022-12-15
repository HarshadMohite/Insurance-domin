package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodUse {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.navigate().to("https://www.iljin.com/?lang=en");
       Thread.sleep(800);
       
       driver.navigate().to("https://www.amazon.in/");
       Thread.sleep(800);
       
       driver.navigate().back();
       Thread.sleep(800);
       
       driver.navigate().forward();
       Thread.sleep(1200);
       
       driver.navigate().refresh();


       
       
	}
	

}
