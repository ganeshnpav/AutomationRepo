package Constructor;

public class Car {
	String model;
	String colour;
	String type;
	
	public Car()  //default constructor  parameterized constructor,  to initialize the objects purpose.
	{
		
	}
	
	public Car(String model,String colour,String type)   //constructor overloading
	{
	 this.model=model;	//this used when instance varibsle and local variable are same to identify instance variables.
	 this.colour=colour;
	 this.type=type;
	}
	
	
	public void specification()
	{
		//System.out.println(brand+" has "+colour+" colour in "+model+" cars");
		System.out.println("The "+colour+" "+model+" is "+type);
	}

}
