package functions;

public class nonstaticfunctions {

	public static void main(String[] args)
	{
		nonstaticfunctions obj= new nonstaticfunctions();
		int add =obj.sum(10,20);
		System.out.println(add);
		functions1.sum(10,20);
	}
     public int sum(int a, int b)
     {
    	 return(a+b);
     }
}
