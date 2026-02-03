package core_java;

//pyramid  in num
public class Loop7 {
public static void main(String[] args) {
	int i ,j ,k;
	
	for(i=1;i<10;i++) 
	{
		for(k=0;k<9-i;k++) {
			System.out.print(" ");
		}
		for(j=1;j<=i;j++) {
//			System.out.print(" "+j);
			System.out.print(" "+i);
		}
		System.out.println();
	}
}
}
