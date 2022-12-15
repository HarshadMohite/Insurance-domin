package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisadvantagesOfHardAssert {
  @Test
  public void testing() 
  {
	  String a="Pune";
	  String b=null;
	  
	  //If both are not equal and b is not null then tC should be pass
	  Assert.assertNotEquals(a, b,"a and b is equal TC is failed");
	  Assert.assertNotNull(b, "b is null TC is failed");
  }
}
