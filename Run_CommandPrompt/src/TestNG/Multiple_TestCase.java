package TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Swag_Labs.Listeners.class)

public class Multiple_TestCase {
	Swag_Labs_Main TestExecution = new Swag_Labs_Main ();
	Swag_Labs_Main TestExecution2 = new Swag_Labs_Main ();
	
	
  @Test (groups={"a","b"})
  public void Test1() {
	  
	  TestExecution.Launch();
	  TestExecution.ClickCart();
	  
  }
  @Test(groups={"b"})
  public void Test2() {
	  TestExecution.ClickCart();
	  
  }
  @Test (groups={"a"})

  public void Test3() {
	  TestExecution2.Launch();
	  TestExecution2.Exit();
  }
}
