package garbage.com;

import java.util.Set;
import java.util.TreeSet;

public class SortingName {

	public static void main(String[] args) {
		Set<String> names=new TreeSet<String>();
		names.add("Vijay");
		names.add("Sanjay");
		names.add("Manjay");
		names.add("Tajay");
		
		System.out.println("Sorted Name");
		for(String name:names) {
			System.out.println(name);
		}
		
		
	}

}
