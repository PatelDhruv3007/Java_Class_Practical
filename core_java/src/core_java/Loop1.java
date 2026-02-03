package core_java;

import java.util.Iterator;
import java.util.Scanner;

//n ++ sum

public class Loop1 {
public static void main(String[] args) {
	int i,n,sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the value of N : ");
	n=sc.nextInt();
	
	for (i=1;i<=n;i++) {
		sum = sum + i;
		
	}
	System.out.println("sum of n : "+sum);
	
}
}
