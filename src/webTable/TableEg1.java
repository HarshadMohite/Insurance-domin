package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1200);
        
        //How many rows in table?
        List<WebElement> totalRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
        System.out.println("Total rows in table is "+totalRows.size());
       
        //How many column in table?
        List<WebElement> totalColumns = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
        System.out.println("Total columns in table is "+totalColumns.size());
  
        //How to read Specific row data
        String myData = driver.findElement(By.xpath("//table[@id='product']//tr[5]/td[2]")).getText();
        System.out.println("My Data is "+myData);
        
        
        //How to read Whole row data by using findElements
         List<WebElement> text = driver.findElements(By.xpath("//table[@id='product']//tr[8]/td"));
       
         Iterator<WebElement> it = text.iterator();
         while(it.hasNext())
         {
        	 System.out.print(it.next().getText()+"    ");
         }
         
         System.out.println();
         //How to read Whole row data by using findElement
        
         for(int i=1;i<=3;i++)
         {
           String data = driver.findElement(By.xpath("//table[@id='product']//tr[6]/td["+i+"]")).getText();
            System.out.print(data+"    ");
         }
        
         
         
	}

}
