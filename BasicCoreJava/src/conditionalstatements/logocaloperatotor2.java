package conditionalstatements;

import java.util.Scanner;

public class logocaloperatotor2 {

	public static void main(String[] args) {
		 int IIT=93;
		 
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter your cet score:");
		 int cet=sc.nextInt();
		 
		
		 if(cet>=80 || IIT>=40)
		 {
			 System.out.println("You are eligible");
		 }else{
			 System.out.println("You are not eligible");
			 }

	}

}
