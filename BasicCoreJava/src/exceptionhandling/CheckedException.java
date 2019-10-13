package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CheckedException {
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Step 1");
		
		Thread.sleep(2000);
		
		System.out.println("Step 2");
		
		
		FileInputStream file=new FileInputStream("");//*******8
	}

}
