	package org.kh.site;
	//논리 연산자 : &&(and), || (or), |(not)
	public class Operation6 {
	
		public static void main(String[] args) {
			int a = 26;
			int b = 28;
			int c = 27;
			
			// and 논리(&&) : 모든 입력값이 True 여야 True 로 출력됨 → 논리곱
			System.out.println("a > b && a > c : "+(a > b && a > c));	// F && F = F
			System.out.println("a > b && b > c : "+(a > b && b > c));	// F && T = F
			System.out.println("a > b && b < c : "+(a < b && b < c));	// T %% F = F
			System.out.println("a > b && b < c : "+(a < b && b > c));	// T %% T = T
	
			// or 논리(||) : 입력이 어느 하나라도 True 이면 True → 논리합
			System.out.println("a > b || a > c : "+(a > b || a > c));	// F || F = F
			System.out.println("a > b || b > c : "+(a > b || b > c));	// F || T = T
			System.out.println("a > b || b < c : "+(a > b || b < c));	// T || F = T
			System.out.println("a > b || b < c : "+(a > b || b < c));	// T || T = T
			
			// not 논리(|) : 입력이 True 이면 출력은 False, 입력이 False 이면 출력은 True → 논리부정
			System.out.println("!a > b | a > c : "+!(a > b | a > c));	// F | F = T
			System.out.println("!a > b | b > c : "+!(a > b | b > c));	// F | T = F
			
		}
	
	}