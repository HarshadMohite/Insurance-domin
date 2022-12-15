package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxHomePage
{
   @FindBy( xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userId;
	
	@FindBy( id = "funds") private WebElement funds;
	
	@FindBy( xpath = "//div[text()='Logout']") private WebElement logOutButton;
	
	
	public  UpStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validateUserId()
	{
       String actualUserId = userId.getText();
		
       String expectedUserId="Harshad M.";
       
       if(actualUserId.equals(expectedUserId))
       {
    	   System.out.println("Actual and Expected UserId are matching TC is Passed");
       }
       else
       {
    	   System.out.println("Actual and Expected UserId are not matching TC is Failed");
       }
       
	}
	
	
       public void clickOnFundButton()
       {
    	 funds.click();  
       }
       
       
       public void logOut() throws InterruptedException
       {
    	   userId.click();
    	   Thread.sleep(1000);
    	   
    	   logOutButton.click();
       }
       
       
    
}
