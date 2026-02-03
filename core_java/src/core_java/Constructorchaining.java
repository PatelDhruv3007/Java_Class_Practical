package core_java;

class A1{
	A1(){
		System.out.println("A is default constructor");
	}
}
class B1 extends A1{
	B1(){
		System.out.println("B is default constructor");
	}
}
class C1 extends B1{
	C1(){
		System.out.println("c is default constructor");
	}
}
public class Constructorchaining {
	public static void main(String[] args) {
		C1 c = new C1();
	}
}
