package core_java;

import java.util.Scanner;

//import sun.jvm.hotspot.tools.SysPropsDumper;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Welcome to java");
		String name ;
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		name = sc.nextLine();
		System.out.print("Enter the value of A : ");
		a = sc.nextInt();
		System.out.print("Enter the value of b : ");
		b = sc.nextDouble();
		c = a+b;
		System.out.println("The addition is = " + c);
		c = a-b;
		System.out.println("The substraction is = " + c);
		c = a*b;
		System.out.println("The multiplication is = " + c);
//		c = a%b;
		System.out.println("The division is = " + (a%b));
		
//		
		
//		name = sc.nextLine();
		System.out.println(name);
		
				
	}

}
