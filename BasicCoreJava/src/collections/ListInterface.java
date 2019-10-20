package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.testng.annotations.Test;

public class ListInterface {
	
	@Test(enabled=false)  //to remove testcase/function from execution
	public void test()
	{
		 List list=new ArrayList<>();
		 list.add("Ganesh");
		 list.add(20);
		 list.add(true);
		 list.add(new ListInterface());
	}
	
	@Test
	public void test2()
	{
		List<String> list= new ArrayList<>();//to make generic
		list.add("Ganesh");
		list.add("Chahyal");
		list.add("Techbodhi");
		list.add("Ganesh");
		list.add("Chahyal");
		list.add("Techbodhi");
		
		for(String object: list) //enhanced for loop for("datatype of collection or array" "variable name": "array or collection name")
		{
			System.out.println(object);
		}
	}
	
	@Test
	public void test3()
	{
		List<String> list= new LinkedList<>();//to make generic
		list.add("Ganesh");
		list.add("Chahyal");
		list.add("Techbodhi");
		list.add("Ganesh");
		list.add("Chahyal");
		list.add("Techbodhi");
		
		for(String object: list) //enhanced for loop for("datatype of collection or array" "variable name": "array or collection name")
		{
			System.out.println(object);
		}
	}
	
	@Test
	public void test4()
	{
		List<String> list= new Vector<>();//to make generic
		list.add("Ganesh");
		list.add("Chahyal");
		list.add("Techbodhi");
		list.add("Ganesh");
		list.add("Chahyal");
		list.add("Techbodhi");
		
		for(String object: list) //enhanced for loop for("datatype of collection or array" "variable name": "array or collection name")
		{
			System.out.println(object);
		}
	}

}
