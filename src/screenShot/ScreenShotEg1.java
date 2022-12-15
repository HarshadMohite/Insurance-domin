package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShotEg1 {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
       
      
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         System.out.println(src);
         
         File dest= new File("C:\\Software Testing class\\my Screenshot\\myFile.png");
        FileHandler.copy(src, dest);
	}

}
