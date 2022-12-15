package practiceStudys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement_Studay {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1200);
        
        //1. to fine list box
        WebElement dropDownList = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        
		//2. Create an Object os select class whitch is accept webelement as argument
        Select s=new Select(dropDownList);
        
        //.	//3)by using one of the select class methods we can select values frome list box like
		// 1. selectByVisibleText:selectByVisibleText("StringArg")
		// 2. selectByIndex:selectByIndex(int Arg)
		// 3. selectByValue:selectByValue("StringArg")

	      s.selectByVisibleText("Option2");
	      Thread.sleep(1000);
	    
	      s.selectByIndex(3);
	      Thread.sleep(1000);

	      s.selectByValue("option1");
	      Thread.sleep(1000);
	      
	      System.out.println(s.getFirstSelectedOption().getText());
	      
	      System.out.println("Multiple select is "+s.isMultiple());

		
		
		
		
		
		
		
	}

}
