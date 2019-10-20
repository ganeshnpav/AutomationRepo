package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class MapInterface {
	@Test(enabled=false)
	public void test1()
	{
		Map<String, String> map= new HashMap<String, String>(); //allow null key
		map.put("Name1", "Srishti");
		map.put("Name2", "Ganesh");
		map.put("Name3", "Aniket");
		map.put("Name4", "Rahul");
		map.put(null, "pratik");
		
		System.out.println(map.get("Name1"));
		System.out.println(map.get("Name2"));
		System.out.println(map.get("Name3"));
		System.out.println(map.get("Name4"));
		
		
		Set<String> keys= map.keySet();//gives set of keys
		for(String key:keys) //to get keys from the set of keys.
		{
			System.out.println(map.get(key));
		}
		
	
	}
	
	@Test
	public void test2()
	{
		Map<String, String> map= new Hashtable<String, String>(); //cannot allow null key
		map.put("Name1", "Srishti");
		map.put("Name2", "Ganesh");
		map.put("Name3", "Aniket");
		map.put("Name4", "Rahul");
	//	map.put(null, "pratik");
		
		System.out.println(map.get("Name1"));
		System.out.println(map.get("Name2"));
		System.out.println(map.get("Name3"));
		System.out.println(map.get("Name4"));
		
		
		Set<String> keys= map.keySet();//gives set of keys
		for(String key:keys) //to get keys from the set of keys.
		{
			System.out.println(map.get(key));
		}
		
	
	}


}
