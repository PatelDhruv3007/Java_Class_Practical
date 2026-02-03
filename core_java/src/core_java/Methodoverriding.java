package core_java;

class A2{
	void show() {
		
		System.out.println("Show the A1");
	}
}
class B2 extends A2{
	void show() {
		super.show();
		System.out.println("Show the B1");
	}
}

class C2 extends B2{
	
	void show() {
		super.show();
		System.out.println("Show the c1");
	}
}


public class Methodoverriding {
public static void main(String[] args) {
	C2 c = new C2();
	c.show();
	
}
}
