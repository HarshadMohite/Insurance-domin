package dropDwon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demoqa.com/select-menu");
        
        //1. Identify list box
        WebElement MultiSelectDropDown = driver.findElement(By.id("cars"));
		
		//2. Create an Object os select class whitch is accept webelement as argument
        Select s= new Select(MultiSelectDropDown);
        
        
        System.out.println("Multiple selectable status is "+s.isMultiple());
		Thread.sleep(1000);
		
		//3)by using one of the select class methods we can select values frome list box like
		// 1. selectByVisibleText:selectByVisibleText("StringArg")
		// 2. selectByIndex:selectByIndex("StringArg")
		// 3. selectByValue:selectByValue("StringArg")

	    s.selectByVisibleText("Volvo");
		Thread.sleep(1000);

		s.selectByValue("audi");
		Thread.sleep(1000);

		s.selectByIndex(1);
		Thread.sleep(1000);
        
		s.deselectAll();
		
		s.selectByIndex(3);
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		// for  list Traversing 
		List<WebElement> option = s.getOptions();
		for(WebElement o:option)
		{
			System.out.println(o.getText());
		}
		
		
		
	}

}
