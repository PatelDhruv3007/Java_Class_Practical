package core_java;

abstract class Abs1{
	
	void math() {
		System.out.println("math 1");
	}
	abstract void math2();
	abstract void math3();
	
}

class Abs2 extends Abs1{
	
	void math2(){
		System.out.println("math 2 ");
	}
	void math3(){
		System.out.println("math 3 ");
	}
}

public class Abstractclass {

	public static void main(String[] args) {
		Abs2 a = new Abs2();
		a.math();
		a.math2();
		a.math3();
	}
}
