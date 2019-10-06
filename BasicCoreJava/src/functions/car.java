package functions;

public class car {
	String colour;
	static int wheels;
	String model;
	String brand;
	
	public void powersteering()
	{
		System.out.println("All "+wheels+" wheels support powersteering");
		
	}
	
	public void lookandfeel()
	{
		System.out.println(brand+" has "+colour+" colour in "+model+" cars");
	}
}
