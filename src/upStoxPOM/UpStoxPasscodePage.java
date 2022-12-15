package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPasscodePage 
{
   //variable declare
	
	@FindBy( id = "yob") private WebElement yearOfBirth;
	
	//Initialize variable in constructor
	public UpStoxPasscodePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	

	//usage in method
	public void enderPasscode()
	{
	
		yearOfBirth.sendKeys("1995");
		//yearOfBirth.sendKeys(pCode);
	}
	
	
}
