package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
      //  driver.manage().window().maximize();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        
        //how to get size
        Dimension defaultSize = driver.manage().window().getSize();
        System.out.println(defaultSize);
        
        //to set the size ..we neet to create object of Dimension class and poass width & height value
        Dimension d=new Dimension(1200, 400);
        
        //by using object of dimension class set the size using setSizeMethod
        driver.manage().window().setSize(d);
        Thread.sleep(1000);
        
        Dimension d1=new Dimension(900, 600);
	    driver.manage().window().setSize(d1);
	
	
	}

}
