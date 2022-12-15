package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
  @Test
  public void A() 
  {
	  System.out.println("Test A is passed"); // this is showes only consol
	  
	  Reporter.log("Test a is Passed True",true); // by using this method we show the test in consol as well as test report
  }
}
