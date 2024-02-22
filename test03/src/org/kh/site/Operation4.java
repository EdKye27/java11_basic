package org.kh.site;
// 증감 연산 : ++, --
public class Operation4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		// a++ → a = a+1
		
		System.out.println("전위 증가 연산 : "+(++a));	//a 먼저 증가시키고 출력한 것 
		System.out.println("후위 증가 연산 : "+(b++));	//b 먼저 출력하고 나중에 1씩 증가시킨 것, 실제값 11
		System.out.println("전위 감소 연산 : "+(--a));	//a 먼저 감소시키고 출력한 것
		System.out.println("후위 감소 연산 : "+(b--));	//b 먼저 출력시키고 나중에 1씩 감소시킨 것
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		

	}

}
