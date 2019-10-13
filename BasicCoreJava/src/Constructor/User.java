package Constructor;

public class User {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.colour="Red";
		car1.model="sedan";
		car1.type="Automatic";
		car1.specification();
		
		Car car2=new Car();
		car2.colour="white";
		car2.model="Hatchback";
		car2.type="Automatic";
		car2.specification();
		
		Car car3=new Car();
		car3.colour="blue";
		car3.model="SUV";
		car3.type="manual";
		car3.specification();
		
		Car car4=new Car("Sedan","Black","Manual");
        car4.specification();
	}

}
