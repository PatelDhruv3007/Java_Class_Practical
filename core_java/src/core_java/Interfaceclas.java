package core_java;

interface Ifs1{
	static void math1()
	{
		System.out.println("math1 is define by static is ");
	}
}

interface Ifs2 extends Ifs1{
	void math2();
}

public class Interfaceclas implements Ifs2{
	
	public static void main(String[] args) {
		Interfaceclas i = new Interfaceclas();
		Ifs1.math1();
		i.math2();
	}

//	public void math1() {
//		System.out.println("math1");
//	}
	public void math2() {
		System.out.println("math2");
	}
}
