package core_java;

//right angel in alphabet
public class Loop8 {
public static void main(String[] args) {
	int i ,j ;
	int num = 65;
	for(i=65;i<=90;i++) 
	{
		for(j=65;j<=i;j++) {
//			System.out.print((char)j);
			System.out.print((char)i);
		}
		System.out.println();
	}
}
}
