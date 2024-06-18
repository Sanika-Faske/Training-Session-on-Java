package Day_3.pack;

public class arraycopy {
	public static void main(String args[]) {
		
		//Create and initialize array  of integers	
		int[] source= {1,2,3,4,5};
		//Create and initialize array with 10 element
		int[] dest =new int [10];
		
		//Copying an elements from source to dest array 
		System.arraycopy(source, 0, dest, 0, source.length);
		for(int i=0; i<dest.length; i++) {
			System.out.println("Element at index " + i + ":" + dest[i]);
		}
	}
}