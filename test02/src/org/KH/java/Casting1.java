package org.KH.java;
//형 변환1(Auto Casting, Force Casting) = type conversion
public class Casting1 {
	public static void main(String[] args) {
		byte b = 20;	//1byte
		short s = b;	//2byte byte → short 값으로 
		int i = s;		//4byte short → integer 값으로
 		long l = i;		//8byte integer → long 값으로
		
		//Force Casting : 큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 타입을 변환하는 것
		int i2 = (int) l;
		short s2 = (short) i;
		byte b2 = (byte) s;
	}

}
