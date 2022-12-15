package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void testing() 
  {
	  
	  boolean b=true;
		 
      Assert.assertFalse(b,"a is true Tc failed");
		  
  }
}
