package student.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Student_Main {

	public static void main(String[] args) {
		
//		Student obj=new Student(1,"Sanika","Faske");
//		String s=obj.toString();
//		System.out.println(s);
		
		Map<Integer,Student> studentMap=new HashMap<Integer,Student>();
		
		studentMap.put(1,new Student(1,"Sanika","Faske"));
		studentMap.put(2,new Student(2,"Madhuri","Patil"));
		studentMap.put(3,new Student(3,"Sakshi","Ugare"));
		
		Iterator<Entry<Integer, Student>> entry=studentMap.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<Integer, Student> temp=entry.next();
			System.out.println("key "+temp.getKey()+" value "+temp.getValue());
			
		}
		
	

	}

}
