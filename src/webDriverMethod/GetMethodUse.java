package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodUse {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        //1 get- to enter url in browser or to open an application.
       driver.get("https://www.flipkart.com/");
       // 2.close- to close the Current tab of the browser which is open bye selenium tool.
       // driver.close();
        driver.get("https://www.instagram.com/?hl=en");
        
        // 2 quit- to close the All the tab of the browser which is open by selenium tool.
        //driver.quit();
        
        driver.manage().window().maximize();
        
        driver.manage().window().minimize();
	}

}
