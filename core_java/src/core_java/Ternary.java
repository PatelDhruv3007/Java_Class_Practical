package core_java;

import java.util.Scanner;

public class Ternary {
public static void main(String[] args) {
	int a,b;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value A : ");
	a = sc.nextInt();
	
	System.out.println("Enter the value of B : ");
	b = sc.nextInt();
	
	int max = (a>b) ? a : b;
	System.out.println("Maximun value is : " + max);
	
	int min = (a<b) ? a : b;
	System.out.println("Minimun value is : " + min);
}
}