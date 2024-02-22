		package org.KH.java;
		
		public class Variable3 {
		
			public static void main(String[] args) {
				int bin = 0b10111;	//2진수 데이터 입력 시 해당 숫자 앞에 0b로 시작
				int oct = 03647;
				int dec = 3650;
				int hex = 0x2c8;
				
				System.out.println("bin="+bin);
				System.out.println("oct="+oct);
				System.out.println("dec="+dec);
				System.out.println("hex="+hex);
				System.out.println("각 진수로 출력");
				System.out.println("dec를 2진수="+Integer.toBinaryString(dec));	//2진수로 출력하여라!
				System.out.println("dec를 8진수="+Integer.toOctalString(dec));	//8진수로 출력하여라!
				System.out.println("dec를 16진수="+Integer.toHexString(dec));		//16진수로 출력하여라!
				/*
				 %s : 문자열 → printf
				 %d : 10진 정수
				 %f : 실수
				 %o : 8진수
				 %x : 16진수
				 %e : 지수 표현방식 (제곱)
				 %n : 줄바꿈
				 */
				System.out.printf("dec 8진수 : %o",dec);
				System.out.printf("dec 16진수 : %x",dec);
				
				
			}
		
		}