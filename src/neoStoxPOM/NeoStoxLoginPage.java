package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxLoginPage
{   
	
	//1. Variable declaration (Globally)--> no of elements= no of variables
	//Data member should be declared globally with the access level private using @findBy Annotaion

    @FindBy(id ="MainContent_signinsignup_txt_mobilenumber") private WebElement mobNum;
	@FindBy(id = "lnk_signup1") private WebElement signUpButton;
	
	
	//2. Initialize withing a Constructor with access level public using pagefactory

	public NeoStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void entertMoblieNumer()
	{
		mobNum.sendKeys("8390998807");
	}
	
	public void clickOnSignUpBotton()
	{
		signUpButton.click();
	}
	
	
	
	
	
	
	
}
