package pack;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		if (age>=18) {
			System.out.println("Eligible for votting");
		}else {
			System.out.println("Not Eligible for votting");
		}	
		
	}

}
