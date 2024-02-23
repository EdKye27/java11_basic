package org.KH.object1;

public class Compute01 {
	
	void fnc1() {								//함수 1형태 : 매개변수 X, 반환 X
		System.out.println("안녕하세요!");
	}
	
	void fnc2(int a) {							//함수 2형태 : 매개변수 O, 반환 X
		System.out.println(a+" 를 입력하셨네요!");
	}
	
	int fnc3 () {								//함수 3형태 : 매개변수 X, 반환 O
		return 0207;
	}
	
	String fnc4 (int point) {					//함수 4형태 : 매개변수 O, 반환 O
		if(point>=90) return "최고네요!";
		else return "최고가 되기 위해 노해보자!";
	}

}
