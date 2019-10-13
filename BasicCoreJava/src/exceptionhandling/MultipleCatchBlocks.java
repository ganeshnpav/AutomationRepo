package exceptionhandling;

import oops.abstraction.ICICI;

public class MultipleCatchBlocks {
	static ICICI bank;

	public static void main(String[] args) 
	{
		
		try {
		
       //example1
		System.out.println(10/1);
		
		//Example 2
		
		String[] arr=new String[2];
		arr[0]="Anand";
		arr[1]="Ganesh";
		//arr[2]="asdfgjj";
		
		//Example 3:Nullpointer exception
		bank.CreditCard();
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Testcases completed");
			System.out.println("Report ending");
			System.out.println("Object flush");
		}
		}
		
		
		}
		
	


