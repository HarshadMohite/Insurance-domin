package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelcomePage
{
     ////1. Variable declaration (Globally)--> no of elements= no of variables
	@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement noIamGoodButton;
	
	
	
	//2. Initialize withing a Constructor with access level public using pagefactory
	public UpstoxWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//3.Utilize within a method with access level public
	public void clickOnNoImGoodButton()
	{
		noIamGoodButton.click();
	}
	
	
	
	
	
	
}
