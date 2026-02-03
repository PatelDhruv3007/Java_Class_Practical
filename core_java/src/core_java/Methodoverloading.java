package core_java;

public class Methodoverloading {
	void test() {
		System.out.println("Test without argumnents");
	}
	void test(int a) {
		System.out.println("Test with 1 argumnents");
	}
	void test(int a, int b) {
		System.out.println("Test with 2 argumnents");
	}
public static void main(String[] args) {
	Methodoverloading m = new Methodoverloading();
	m.test();
	m.test(0);
	m.test(0, 0);
}
}
