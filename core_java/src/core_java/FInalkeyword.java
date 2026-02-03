package core_java;

class F1
{
	final int a ;
	public F1() {
	a = 10;	
	}
	void show () {
		System.out.println(" Show thw F1");
	}
}

class F2 extends F1
{
	void show () {
		super.show();
		System.out.println(" Show thw F2");
	}
}
public class FInalkeyword {
public static void main(String[] args) {
	F2 f = new F2();
	f.show();
}
}
