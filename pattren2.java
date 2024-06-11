package com.statement;

public class pattren2 {

	public static void main(String[] args) {
		int k=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i == 5 && j >2) {
					System.out.println(k);
					k--;
				}else {
					System.out.println(j);
				}
			}
			System.out.println();
		}
	}

}
