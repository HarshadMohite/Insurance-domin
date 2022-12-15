package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(1000);
        
        //Cliking on popup button it will show Alert popup
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(100);
        
        //Need to switch selenium focus from main page to alert popup
        Alert alt=driver.switchTo().alert();
        System.out.println(alt.getText()); // get text fron popup
        Thread.sleep(100);
        alt.accept(); // cliking on ok button 
        
        WebElement myText = driver.findElement(By.xpath("//div[text()='Alerts']"));
        System.out.println(myText.getText());
        
        

	}

}
