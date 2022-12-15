package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfail {
  @Test
  public void testing() 
  {
	  Assert.fail();
	  
  }
}
