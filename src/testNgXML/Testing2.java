package testNgXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 {
	@Test (groups = "Un")
	  public void E() 
	  {
		  Reporter.log("E method is running", true);
	  }

	  @Test (groups = "Funds")
	  public void F() 
	  {
		  Reporter.log("F method is running", true);
	  }

	  @Test (groups = "Un")
	  public void G() 
	  {
		  Reporter.log("G method is running", true);
	  }

	  @Test (groups = "Funds")
	  public void H() 
	  {
		  Reporter.log("H method is running", true);
	  }

}
