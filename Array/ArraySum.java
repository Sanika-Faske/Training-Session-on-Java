package Day_3.pack;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        // Define and initialize the array
    	
    	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element: ");
		int[] numbers=new int[5];//declaration of array
		//numbers[i]=sc.nextInt();
        

        // Initialize a variable to store the sum
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int num : numbers) {
            sum += num;
        }

        // Print the sum
        System.out.println("The sum of the array elements is: " + sum);
    }
}

