package core_java;

import java.util.Scanner;

public class Staticvariable {

	static int a ;
	 void seta() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the vallu of a : ");
		 a = sc.nextInt();
		 
	 }
	 void puta() {
		 
		 System.out.println(" a : "+a);
	 }
	 public static void main(String[] args) {
		Staticvariable s1 = new Staticvariable();
		Staticvariable s2 = new Staticvariable();
		Staticvariable s3 = new Staticvariable();
		
		s1.seta();
		s2.seta();
		s3.seta();
		
		s1.puta();
		s2.puta();
		s3.puta();
	}
}
