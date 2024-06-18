package collection.com;

import java.util.HashSet;
import java.util.Set;

public class Set_Demo {

	public static void main(String[] args) {
		Set <String> set=new HashSet<String>();
		set.add("Sanika");
		set.add("Vaishnavi");
		set.add("Priya");
		for(String name:set) {
			System.out.println(name);
		}
		
		System.out.println(set.contains("Sanika"));
		
	}

}
