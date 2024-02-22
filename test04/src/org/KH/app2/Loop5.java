package org.KH.app2;
//do ~ while : 조건이 만족하지 않더라도 1회 이상 실행을 보장하는 문장
public class Loop5 {

	public static void main(String[] args) {
		int a = 0;
		
		while(a>10) {
			a++;
			System.out.println("a="+a);
		}
		// → 이렇게 되면 값이 안나오겠지 값이 성립이 안되니까 do ~ while ~ 사용해보자
		
		do {
			System.out.println("a="+a);
		} while(a>10);
		// 이렇게 하면 값이 a=0 으로 출력된다
		
		// 더 나아가 '역 for 문' 도 알아보자!
		for(int i=10;i>0;i--) {
			System.out.println("i = "+i);
		}
		
		// for 무한루프
		int b = 0;
		for(;;) {
			b++;
			System.out.println("b = "+b);
			if(b >= 10) break;
		}
		
		int tot = 0;
		for(int j=0;j<=100;j++) {	//관계씩에서 부등호(=)는 항상 뒤에 쓴다!  ex. =< 는 안된다
			if(j%2==1) continue;
			tot += j;
		}
		System.out.println("tot = "+tot);
	}

}