package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetInterface {
	@Test(priority=0)
	public void test1()
	{
		Set<Integer> set=new HashSet<>();  //gives random putput
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10); //list allows duplicate entries and set not allows duplicate entries
		
		for (int a:set)
		{
			System.out.println(a);
		}
		System.out.println("********************************************");
	}
	
	@Test(priority=2)  //default priority is 0.
	public void test2()
	{
		Set<Integer> set=new LinkedHashSet<>();//gives output as we have enter the vaues
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(10); //list allows duplicate entries and set not allows duplicate entries
		
		for (int a:set)
		{
			System.out.println(a);
		}
		System.out.println("********************************************");
	}
	
	@Test(priority=1)
	public void test3()
	{
		Set<Integer> set=new TreeSet<>(); //does sorting
		set.add(30);
		set.add(10);
		set.add(10);
		set.add(20); //list allows duplicate entries and set not allows duplicate entries
		
		for (int a:set)
		{
			System.out.println(a);
		}
		System.out.println("********************************************");
	}
}
