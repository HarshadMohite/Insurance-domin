package testNgXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
	@Test
	  public void D() 
	  {
		  Reporter.log("D method is running", true);
	  }

	  @Test (groups = "Funds")
	  public void B() 
	  {
		  Reporter.log("B method is running", true);
	  }

	  @Test (groups = "Un")
	  public void A() 
	  {
		  Reporter.log("A method is running", true);
	  }

	  @Test (groups = "Un")
	  public void C() 
	  {
		  Reporter.log("C method is running", true);
	  }

}
