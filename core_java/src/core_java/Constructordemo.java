package core_java;

class Box{
	double width,height,depth;
	Box(){
		System.out.println("Default constructor");
		width =10;
		height = 20;
		depth = 30;
	}
	Box(double w, double h, double d){
		System.out.println("parametrized constructor");
		width =w;
		height = h;
		depth = d;
	}
	Box(Box b){
		System.out.println("copy constructor");
		width =b.width;
		height =b.height;
		depth =b.depth;
	}
	void volume(){
		System.out.println("Volume is : "+(width*height*depth));
		
	}
}
public class Constructordemo {
	
public static void main(String[] args) {
	Box b1 =new Box();
	b1.volume();
	Box b2 =new Box(1,2,3);
	b2.volume();
	Box b3 =new Box(b2);
	b3.volume();
}
}
