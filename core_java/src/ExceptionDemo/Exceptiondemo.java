package ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) {
		System.out.println("Start cosde");
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter A :");
			a = sc.nextInt();
			System.out.print("Enter B :");
			b = sc.nextInt();
			c= a/b;
			System.out.println("division is :"+c);
			int arr[]= {1,2,3,4,5};
			
			System.out.print("Enter the index value :");
			int index = sc.nextInt();
;			System.out.println(arr[index]);
		}
//		catch (Exception e) {
//			System.out.println("Exception caucgt :"+e);
//		}
		catch (ArithmeticException e) {
			System.out.println("Error caught :"+e);
		}
		catch (InputMismatchException e) {
			System.out.println("Error caught :"+e);
		}
		System.out.println("code end ");
	}
}
