package oops.inheritance;

public class User {

	public static void main(String[] args) {
		Smartphone phone=new Smartphone();
		phone.internet();
		phone.texting();
		
		Telephone phone2=new Telephone();
		phone2.calling(); 	
		phone2=new Mobile();//can use parent reference to create child object,  to access overriden functions, dynamic polymorphism(runtime binding) and method overloading is nothing but static polymorphism
		
		phone2.calling();
		
		
	}

}
