package org.KH.java;

public class Variable2 {

	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i;	//선언(0). 초기화(X) → 그냥 출력 시 Null Pointer 오류를 일으킴
		long l;	//선언(0). 초기화(X) → 그냥 출력 시 Null Pointer 오류를 일으킴
		i = 30;
		l = 60;
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
//		b = 130; Overflow
//		b = -130; Underflow
	}

}
