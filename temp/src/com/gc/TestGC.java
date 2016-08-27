package com.gc;

public 	class TestGC {
	public static void main(String[] args) {
		HeHe h1=new HeHe("h1",22);
		HeHe h2=new HeHe("h2",23);
		h1=h2;
		h2=null;
		System.gc();
		System.out.println(h1);
		System.out.println(h2);
	}
}
