package com.p1;

public class Nonderived {
	public Nonderived (){
		Protection p = new Protection();
		System.out.println("NonDerived constructor");
		System.out.println("n : "+p.n);
		System.out.println("n_pub : "+p.n_pub);
		System.out.println("n_pro : "+p.n_pro);
//		System.out.println("n_pri : "+n_pri);
	}

	
}
