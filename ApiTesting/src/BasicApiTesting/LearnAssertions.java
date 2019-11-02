package BasicApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertions 
{
	int a=10;
	int b=20;
	int c=30;
	@Test
	public void test1()
	{  //Hard assertions
		
		System.out.println("Step1");
		Assert.assertEquals(11, a);
		
		System.out.println("Step2");
		Assert.assertEquals(20, b);
		
		System.out.println("Step3");
		Assert.assertEquals(30, c);
	}
	
	@Test
	public void test2()
	{ 
		SoftAssert asr=new SoftAssert();
		

		System.out.println("Step1");
		asr.assertEquals(11, a);
		
		System.out.println("Step2");
		asr.assertEquals(20, b);
		
		System.out.println("Step3");
		asr.assertEquals(30, c);
		asr.assertAll();
	}
	

	

}
