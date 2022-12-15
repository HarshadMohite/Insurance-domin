package verificationUsingTestNG;

import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void testing() 
  {
	  
	  String a=null;
	  
	  assertNotNull(a,"a is null TC is failed");
	  
  }
  
  
}
