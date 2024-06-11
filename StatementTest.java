package com.statement;

import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		String answer; 
		do {
		Scanner input = new Scanner(System.in);
		System.out.println("Curisity is the starting point for great adventure...!");
		System.out.println("Enter the Quantity : ");
		float quantity=input.nextFloat();
		System.out.println("Enter the Price : ");
		float price=input.nextFloat();
		float total=quantity*price;
		System.out.println("Total is : "+total);
		
		System.out.println("---------------------------------------------");
		
		
		System.out.println("Do you want to perform again : ");
		answer=input.next();
		
		}while(answer.equals("Yes"));
		
	}

}
