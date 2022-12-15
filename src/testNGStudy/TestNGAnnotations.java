package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {
  @Test
  public void myTest() 
  {
	  Reporter.log("This is My Test", true);
  }

   @BeforeMethod
   public void beforeMethod()
   {
	  Reporter.log("Before method is running",true);
   }

    @AfterMethod
    public void afterMethod()
    {
    	Reporter.log("After method is running", true);
    }
    
    @BeforeClass
    public void beforeClass()
    {
    	Reporter.log("Before Class is running",true);
    }
    
    @AfterClass
    public void afterClass()
    {
    	Reporter.log("After class is running",true);
    }
    






















}
