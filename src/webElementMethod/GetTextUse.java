package webElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
        
//        // Printing way 1
//       String myText = driver.findElement(By.xpath("//h2[text()='Blockbuster Deals']")).getText();
//       System.out.println("My Text is "+myText);
////       
//       // Printing way 2
//       WebElement myText = driver.findElement(By.xpath("//h2[text()='Blockbuster Deals']"));
//	    System.out.println(myText.getText());
//	    
	    //Printing way 3
	    System.out.println(driver.findElement(By.xpath("//h2[text()='Blockbuster Deals']")).getText());
	
	
	}

}
