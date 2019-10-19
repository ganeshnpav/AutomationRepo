package BasicTestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImageStatus {
	
	@BeforeTest
	public void beforeStatusModule()
	{
		System.out.println("Gallery should be accessible");
	}
	@AfterTest
	public void afterStatusModule()
	{
		System.out.println("After status module");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Pre condition for image status");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("Post condition for image status");
	}
	@BeforeMethod
	public void preConditionForTestCase()
	{
		System.out.println("Keypad should be enabled");
	}
	@AfterMethod
	public void postConditionForTestCase()
	{
		System.out.println("Keypad should be disabled");
	}
	@Test
	public void test1()
	{
		System.out.println("Image status Test Case 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Image status Test Case 2");
	}
	@Test
	public void test3()
	{
		System.out.println("Image status Test Case 3");
	}

}
