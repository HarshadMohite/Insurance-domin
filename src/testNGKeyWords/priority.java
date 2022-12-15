package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
  @Test (priority = -1)
  public void D() 
  {
	  Reporter.log("D method is running", true);
  }

  @Test (priority = 1)
  public void B() 
  {
	  Reporter.log("B method is running", true);
  }

  @Test
  public void A() 
  {
	  Reporter.log("A method is running", true);
  }

  @Test (priority = 2)
  public void C() 
  {
	  Reporter.log("C method is running", true);
  }














}
