package core_java;

import java.util.Scanner;

public class Whileloop {
public static void main(String[] args) {
	int sum=0,num;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter thhe number : ");
	num=sc.nextInt();
	
	while (num>0) {
		sum = sum + num;
		num--;
	}
	System.out.println("sum : "+sum);
	
}
}
