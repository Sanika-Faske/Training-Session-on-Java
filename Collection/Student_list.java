package collection.com;

import java.util.ArrayList;
import java.util.List;

public class Student_list {

	public static void main(String[] args) {
		
		List <Integer> ls=new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		System.out.println(ls);
		ls.add(5);
		System.out.println(ls);
		List <Integer> list=new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		ls.addAll(list);
		System.out.println(list);
		System.out.println(ls.get(5));
		ls.remove(7);
		System.out.println(ls);
		
		
		
	}

}
