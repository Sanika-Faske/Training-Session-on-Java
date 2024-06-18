package collection.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Interator_Demo {

	public static void main(String[] args) {
		LinkedList<String> countries=new LinkedList<String>();
		
		countries.add("India");
		countries.add("USA");
		countries.add("IRE");
		countries.add("Africa");
		countries.add("Austrollia");
		countries.add("Itali");
		
		//ListInterfaceDemo demo=new ListInterfaceDemo();
		//demo.printList(countries);
		
		Interator_Demo obj=new Interator_Demo();
		//obj.printList(countries);
	}
	
	/*void printList(List<String> list) {
		for(String element:list) {
			System.out.println("Element : " + element);
			
		}*/
	
//	Iterator<String> iterator=list.iterator();
//	while(iterator.hasNext()) {
//		System.out.println("Element : "+iterator);
//		
//	}
//	
//	ListIterator<String> iterator1=list.iterator();
//	while(iterator.hasNext()) {
//		System.out.println("Element : "+iterator1);
//	}
	
	
	
	

}
