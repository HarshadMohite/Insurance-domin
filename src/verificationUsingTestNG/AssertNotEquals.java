package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void testing() 
  {
	  String a="abc1";
	  String b="abc";

    //if both are not same then Tc is passed
  
	 Assert.assertNotEquals(a, b,"a and b are same TC is failed");
	  
	  
	  
	  
	  
	  
	  
  }
}
