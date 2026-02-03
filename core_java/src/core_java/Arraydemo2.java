package core_java;

import java.util.Scanner;

public class Arraydemo2 {
public static void main(String[] args) {
	int  a[] = new int [0];
	int i;
	Scanner sc = new Scanner(System.in);
	
	for(i=0;i<a.length;i++) {
		System.out.println("Enter the array "+i+" Element : ");
		a[i]=sc.nextInt();
	}
}
}
