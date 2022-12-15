package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void testing() 
  {
	  String a=null;
	  
	  Assert.assertNull(a,"a is not null Tc is failed");
  }
}
