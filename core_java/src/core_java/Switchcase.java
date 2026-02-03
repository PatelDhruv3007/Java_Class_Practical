package core_java;

import java.util.Scanner;

public class Switchcase {
public static void main(String[] args) {
	int a,b,c,d;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the value of A :");
	a = sc.nextInt();
	
	System.out.print("Enter the value of B :");
	b = sc.nextInt();
	
	System.out.println("1. for addition");
	System.out.println("2. for substraction");
	System.out.println("3. for multiplication");
	System.out.println("4. for division");
	
	System.out.print("Enter yout choice : ");
	c = sc.nextInt();
	
	switch (c) {
	case 1:
		d=a+b;
		System.out.println("Addition is "+ d);
		break;
	case 2:
		d=a-b;
		System.out.println("Substraction is "+ d);
		break;
	case 3:
		d=a*b;
		System.out.println("Mulplication is "+ d);
		break;
	case 4:
		d=a/b;
		System.out.println("Division is "+ d);
	break;
	default:
		System.out.println("Invalid choice ");
		break;
	}
	
}
}
