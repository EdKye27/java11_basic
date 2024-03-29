package org.KH.java;

public class Variable1 {

	public static void main(String[] args) {
		boolean a = true;	//논리형 (true, false : 1byte
//		byte b = 255;		// 2의 3승, 256가지로 -128 ~ 127 까지 표시 가능 | 즉, 256은 해당 공간보다 커서 Overflow
//		byte b = -129;		// 해당 공간에 저장할 수 있는 숫자보다 작으므로 Underflow
		byte b = 126;		//1byte = 8bit = 256가지
		short c = 31242;	//2byte = 16bit = 65536가지 (-32768 ~ 32767 까지 저장 가능)
		char d ='k';		//2byte
		int e = 231242;		//4byte
		float f = 3.14f;	//4byte
		long g = 23456789;	//8byte
		double h = 3.14d;	//8byte, Double 로 쓰고 싶으면 'd' 넣어주고! 안넣어도 돌아가긴 함
		
		System.out.println("byte : "+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("short : "+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("char : "+Character.MIN_VALUE+"~"+Character.MAX_VALUE);
		System.out.println("int : "+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("float : "+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		System.out.println("long : "+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println("double : "+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		
	}

}
