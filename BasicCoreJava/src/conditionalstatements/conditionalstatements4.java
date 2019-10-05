package conditionalstatements;

import org.omg.Messaging.SyncScopeHelper;

public class conditionalstatements4 {

	public static void main(String[] args) {
		int a=10;
		int b=40;
		int c=30;
		
		if(a<b)
		{
			if(a> c)
			{
				System.out.println("a is greatest");
			}else {
				System.out.println("C is greatest");
			}
		}else if(b>c)
		{
			System.out.println("b is greatest");
		}
		

	}

}
