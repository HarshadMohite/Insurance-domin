package setSizeSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
      //  driver.manage().window().maximize();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        
        //getting default position
       Point defaultPosition = driver.manage().window().getPosition();
       System.out.println(defaultPosition);
         
       //to set the position ..we neet to create object of Point class and poass x and y value
       Point p=new Point(50, 9);
       driver.manage().window().setPosition(p);
       
	}

}
