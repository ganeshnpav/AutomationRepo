package functions;

public class functions1 {

	public static void main(String[] args) 
	{
		
        int a= sum(10,20);
         int b=sum(30,40);
         System.out.println(a+b);
         nonstaticfunctions obj=new nonstaticfunctions();
        		 System.out.println(obj.sum(10,20));
	}
	/*public static void sum(int a, int b)
	{
		//int a=10;
		//int b=20;
		int sum=a+b;
		System.out.println(sum);
	}*/
	
	public static int sum(int a, int b)
	{
		//int a=10;
		//int b=20;
		int sum=a+b;
		return sum;
	}

}
