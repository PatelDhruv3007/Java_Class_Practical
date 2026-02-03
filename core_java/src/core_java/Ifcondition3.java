package core_java;

import java.util.Scanner;

//later if else

public class Ifcondition3 {
public static void main(String[] args) {
	int rno,s1,s2,s3,total;
	double per;
	String sname;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the name of student : ");
	sname = sc.next();
	
	System.out.print("Enter the roll number of student : ");
	rno = sc.nextInt();
	
	System.out.print("Enter the marks od subject 1 : ");
	s1 = sc.nextInt();
	
	System.out.print("Enter the marks od subject 2 : ");
	s2 = sc.nextInt();
	
	System.out.print("Enter the marks od subject 3 : ");
	s3 = sc.nextInt();
	
	total = s1+s2+s2;
	per = total/3;
	
	System.out.println("name of student is : "+sname);
	System.out.println("roll number of student is :"+rno);
	System.out.println("makes of sunject 1 is : "+s1);
	System.out.println("marks od subject 2 is : "+s2);
	System.out.println("marks od subject 3 is : "+s3);
	System.out.println("total of marks is : "+total);
	System.out.println("Percentage is : "+per);
	
	
	if (per>=70) {
		System.out.println("your grade is distinction ");
	}
	else if (per>=60) {
		System.out.println("your grade is first class");
	}
	else if (per>=50) {
		System.out.println("yous grade is second class");
	}
	else if (per>=40) {
		System.out.println("your grade is just pass");
	}
	else {
		System.out.println("you are failed");
	}
}
}
