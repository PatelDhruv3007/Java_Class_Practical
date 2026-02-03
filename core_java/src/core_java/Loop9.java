package core_java;

//left angel in alphabet
public class Loop9 {
public static void main(String[] args) {
	int i ,j ,k;
	int num = 65;
	for(i=65;i<=90;i++) 
	{
		for(k=0;k<=90-i;k++) {
			System.out.print(" ");
		}
		
		for(j=65;j<=i;j++) {
//			System.out.print((char)j);
			System.out.print((char)i);
		}
		System.out.println();
	}
}
}
