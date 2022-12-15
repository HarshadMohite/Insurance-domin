package neoStoxPOM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonMethod 
{
    //Screenshot method
	
	public static void takeScreenShot(WebDriver driver,String name) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Software Testing class\\my Screenshot"+name+".pgn");
		
		FileHandler.copy(scr, dest);	
	}
	
	//scorllinto view
	
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("argumentgs[0].scrollIntoView(true)", element);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
