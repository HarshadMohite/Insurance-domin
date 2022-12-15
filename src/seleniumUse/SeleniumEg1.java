package seleniumUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEg1 {

	public static void main(String[] args)
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing class\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.get("https://www.airindia.in/");
	}

}
