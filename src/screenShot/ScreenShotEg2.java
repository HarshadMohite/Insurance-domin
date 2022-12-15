package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class ScreenShotEg2 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.bikewale.com/");
        
       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
       System.out.println(src);
       
       String random = RandomString.make(4);
       
       File dest=new File("C:\\Software Testing class\\my Screenshot\\myS"+random+".png");
       
       org.openqa.selenium.io.FileHandler.copy(src, dest);
         

	}

}
