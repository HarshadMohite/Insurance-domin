package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void Testing() 
  {
	 boolean a=false;
	 
	 Assert.assertTrue(a,"a is false Tc failed");
	  
	  
  }
}
