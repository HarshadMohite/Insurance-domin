package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserID
{
  @Test
  public void validateUpStoxUserID() 
  {
	  Reporter.log("User ID validated", true);
  }

  @BeforeMethod
  public void logInToUpStox()
  {
	  Reporter.log("Login Success", true);
  }
  
  @AfterMethod
  public void logOutFromUpStox()
  {
	  Reporter.log("Loging Out ", true);
  }

  @BeforeClass
  public void lounchBrowser()
  {
	  Reporter.log("Lounching Browser", true);
  }

   @AfterClass
   public void closeBrowser()
   {
	   Reporter.log("Closing browser", true);
   }



















}
