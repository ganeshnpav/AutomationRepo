package BasicTestNGAnnotations;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupChat {
	@BeforeTest
	public void beforeChatModule()
	{
		System.out.println("Contacts should be loaded");
	}
	@AfterTest
	public void afterChatModule()
	{
		System.out.println("After chat module");
		System.out.println("****************************");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Create group");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("Delete Group");
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
		//System.out.println("Group Chat Test Case 1");
	   throw new SkipException("Group Chat Test case 1");
	}
	@Test
	public void test2()
	{
		
		//System.out.println("Group Chat Test Case 2");
		System.out.println(10/0);
	}
	@Test
	public void test3()
	{
		System.out.println("Group Chat Test Case 3");
	}

}
