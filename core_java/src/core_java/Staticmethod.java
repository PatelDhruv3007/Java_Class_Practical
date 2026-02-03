package core_java;


public class Staticmethod {

	static int a=10;
	static int b;
	{
		System.out.println("block 2");
	}
	public Staticmethod() {
		System.out.println("constructor");
	}
	static void math(int x) {
	System.out.println("A :"+a);
	System.out.println("B :"+b);
	System.out.println("X :"+x);
	}
	
	static {
		System.out.println("Static block initialized");
		b = a*10;
	}
	public static void main(String[] args) {
		
		Staticmethod s = new Staticmethod();
		math(12);
	}
	{
		System.out.println("block 2");
	}
}
