package exceptionhandling;

public class ThrowAndThrowsKeyword {

	public static void main(String[] args) throws Exception 
	{
       System.out.println("step1");
       pause(-3000);
       System.out.println("step2");
       
	}
	public static void pause(long miliseconds) throws Exception
	{
		if(miliseconds>=0)
		{
		Thread.sleep(miliseconds);
		}else
		{
			throwException("Please enter positive value");
		}
		
	}
	
	public static void throwException(String message) throws Exception
	{
		throw new Exception(message);
	}

}
