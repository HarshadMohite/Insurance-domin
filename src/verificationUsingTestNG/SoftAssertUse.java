package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse
{
	SoftAssert soft=new SoftAssert();
	
  @Test
  public void testing() 
  {
	  String a="Pune";
	  String b=null;
	  
	  //If both are not equal and b is not null then tC should be pass
	 soft.assertNotEquals(a, b, "a and b are equals TC is failed");
	 soft.assertNotNull(b, "b is not null TC is failed");
     soft.assertAll();
  }
  
  @Test
  public void testing1()
  {
	  soft.fail();
	  
	  soft.assertAll();
  }
  
  
}
