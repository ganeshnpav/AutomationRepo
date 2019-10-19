package exceptionhandling;

import oops.abstraction.ICICI;

public class ExceptionHandling1 {
	static ICICI bank;
	public static void main(String[] args) {
		try
		{
			//example1
			System.out.println(10/0);

		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		try {				
				//Example 2
				
				String[] arr=new String[2];
				arr[0]="Anand";
				arr[1]="Ganesh";
				//arr[2]="asdfgjj";
		}catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}
				
				//Example 3
		try {
			
				bank.CreditCard();

		}catch(NullPointerException e)
		{
			
		}
		

	}

}
