package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxLoginPage 
{

	//1. Variable declaration (Globally)--> no of elements= no of variables
	
	//Data member should be declared globally with the access level private using @findBy Annotaion
	
	@FindBy( name = "userId") private WebElement userId;
	@FindBy( name = "password") private WebElement password;
	@FindBy(xpath = "//div[text()='Sign into Upstox']" ) private WebElement signInButton;
	
	//2. Initialize withing a Constructor with access level public using pagefactory

	public UpStoxLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	//3.Utilize within a method with access level public

	public void enterUserId()
	{
		userId.sendKeys("CS8981");
		//userId.sendKeys(un);
	}
	
	public void enterPassword()
	{
		password.sendKeys("Harshad@123");
		//password.sendKeys(pwd);
	}
	
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
	
	
	
	
	
	
}
