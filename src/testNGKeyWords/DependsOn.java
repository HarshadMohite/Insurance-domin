package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn {
	@Test
	  public void D() 
	  {
		  Reporter.log("D method is running", true);
	  }

	  @Test (timeOut = 500)
	  public void B() throws InterruptedException 
	  {    Thread.sleep(1200);
		  Reporter.log("B method is running", true);
	  }

	  @Test (dependsOnMethods = {"B","D"},invocationCount = 3)
	  public void A() 
	  {
		  Reporter.log("A method is running", true);
	  }

	  @Test 
	  public void C() 
	  {
		  Reporter.log("C method is running", true);
	  }

}
