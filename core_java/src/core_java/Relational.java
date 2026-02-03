package core_java;

import java.util.Scanner;

public class Relational {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A : ");
		a = sc.nextInt();
		System.out.println("Enter the value of B : ");
		b = sc.nextInt();
		
		System.out.println("both the  value is  equal : " + (a==b));
		System.out.println("both the  value is not equal : " + (a!=b));
		System.out.println("a greater value is : " + (a>b));
		System.out.println("b less than value is : " + (a<b));

//		System.out.println("the greater value is : " + (a==b));


	}

}
