package core_java;

import java.util.Scanner;

public class Dowileloop {
	public static void main(String[] args) {
		int sum=0,num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter thhe number : ");
		num=sc.nextInt();
		
		do {
			sum = sum + num;
			num--;
		}while(num>0);
		
		System.out.println("sum : "+sum);
		
	}
}
