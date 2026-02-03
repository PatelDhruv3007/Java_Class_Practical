package core_java;

import java.util.Scanner;

public class Ifcondition1 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of A : ");
		a=sc.nextInt();
		
//		if(a>0)
//		{
//			System.out.println("A is a positive number");
//		}
//		else {
//			System.out.println("A is a negative number");
//		}
		
//		
//		if(a%2==0)
//		{
//			System.out.println("A is a even number");
//		}
//		else {
//			System.out.println("A is a odd number");
//		}
		
		
		System.out.print("Enter the value of B : ");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("A is a maximum number");
		}
		else {
			System.out.println("B is a maximun number");
		}

	}
}
