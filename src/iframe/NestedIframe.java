package iframe;

import java.nio.file.spi.FileSystemProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");
        WebElement mainPageElement = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
       System.out.println("main Page Element is "+mainPageElement.getText());
       
       driver.switchTo().frame("frame1");//Switching selenium focus main page to parent frame
       String parentFrameText = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
       System.out.println(parentFrameText);
       
       //switching selenium focus frome parent frame to chile frame
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe [@srcdoc='<p>Child Iframe</p>']")));
        String childframeText = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
       System.out.println(childframeText);
       
       driver.switchTo().defaultContent();//switching selenium focus frome chile frame to main page
        System.out.println(mainPageElement.getText());
       
	}

}
