package ExceptionDemo;

import java.util.Scanner;

public class BankDemo {
	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount(101, "Dhruv", 10000);
		Scanner sc = new Scanner(System.in);
		double amount;
		while (true) {
			System.out.println("*********************************************************");
			System.out.println("1. Deposite");
			System.out.println("2. Withdraw");
			System.out.println("3. Check balance");
			System.out.println("4. Exit");
			System.out.println("*********************************************************");
			System.out.print("Enter your choice : ");
			int choice =sc.nextInt();
			System.out.println("*********************************************************");
			if(choice==1) {
				System.out.print("Enter Deposite Amount : ");
				amount = sc.nextDouble();
				c.deposit(amount);
			}
			else if(choice==2) {
				System.out.print("Enter Widhrawal Amount : ");
				amount = sc.nextDouble();
				try {
					c.widhraw(amount);
				}
				catch (Insufficient e){
					System.out.println("You need anothe "+e.getamount()+"Rs");
				}
			}
			else if(choice==3) {
				c.checkbalance();
			}
			else if(choice==4) {
				System.out.print("Thank u for using  the service");
				amount = sc.nextDouble();
				break;
			}
			else {
				System.out.println("Invalid choice");
			}
			System.out.println("*********************************************************");

		}
	}
}
