package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  public void testing() 
  {
	  String a="Pune";
	  String b="Pune";

    //if both are same( equal) then Tc is passed
  
	 Assert.assertEquals(a, b,"a and b not matching Tc is failed");
	  
  }
}
