package ExceptionDemo;

import java.util.Scanner;

public class Throwdemo {

	public static void name() throws ArithmeticException, IndexOutOfBoundsException{
		int x ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X :");
		x = sc.nextInt();
//		try {
//			if (x>0) {
//				System.out.println("square of "+x+" is : "+(x*x));
//			}
//			else {
//				throw new ArithmeticException();
//			}
//		}
//		catch (Exception e) {
//			System.out.println("Enter the posive number only ");
//			name();
//		}
		if (x>0) {
			System.out.println("square of "+x+" is : "+(x*x));
		}
		else {
			throw new ArithmeticException();
		}
	}
	public static void main(String[] args) {
//		name();
		try {
			name();
		}
		catch (ArithmeticException e){
			System.out.println("Enter the posive number only ");
		}
		finally {
			System.out.println("Finallly");
		}
	}
}
