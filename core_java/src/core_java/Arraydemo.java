package core_java;

import java.util.Scanner;

public class Arraydemo {
public static void main(String[] args) {
	int  a[] = new int [5];
	int i,sum= 0,j,temp;
	Scanner sc = new Scanner(System.in);
	
	for(i=0;i<a.length;i++) {
		System.out.print("Enter the array "+i+" Element : ");
		a[i]=sc.nextInt();
		sum = sum + a[i];
	}
System.out.println("Sum of array is : "+sum );
	for(i=0;i<a.length;i++) {
	System.out.println("Array ["+i+"] is : "+a[i]);
	}
	for(i=0;i<a.length;i++) {
		for(j=i+1;j<a.length;j++) {
			if (a[i]>a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			
		}
	}
	System.out.print("Array on accending order : ");
	for(i=0;i<a.length;i++) {
		System.out.print("  " +a[i]);
	}
	for(i=0;i<a.length;i++) {
		for(j=i+1;j<a.length;j++) {
			if (a[i]<a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			
		}
	}
	System.out.println();
	System.out.print("Array on Descending order : ");
	for(i=0;i<a.length;i++) {
		System.out.print("  " +a[i]);
	}
	
}
}
