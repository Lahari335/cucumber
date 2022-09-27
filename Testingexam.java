package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingexam {
	@Test
	  public void testCase2() {
		  System.out.println("Inside test case 2");

	  }  
	@Test(enabled=false)
public void testCase1() 
{
	  System.out.println("Inside test case 1");
}

@BeforeMethod
public void beforeMethod() {
	  System.out.println("Inside before method");

}

@AfterMethod
public void afterMethod() {
	  System.out.println("Inside after method");

}

@BeforeClass
public void beforeClass() {
	  System.out.println("Inside before class");

}

@AfterClass
public void afterClass() {
	  System.out.println("Inside after class");

}

@BeforeTest
public void beforeTest() {
	  System.out.println("Inside before test");

}

@AfterTest
public void afterTest() {
	  System.out.println("Inside after test");

}

@BeforeSuite
public void beforeSuite() {
	  System.out.println("Inside before suite");

}

@AfterSuite
public void afterSuite() {
	  System.out.println("Inside after suite");
}

}
