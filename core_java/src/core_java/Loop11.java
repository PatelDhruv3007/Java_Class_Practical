package core_java;

//right angel in alphabet
public class Loop11 {
public static void main(String[] args) {
	int i ,j ;
	int num = 65;
	for(i=0;i<=6;i++) 
	{
		for(j=0;j<=i;j++) {
//			System.out.print((char)j);
			System.out.print((char)num);
			num++;
		}
		System.out.println();
	}
}
}
