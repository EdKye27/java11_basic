package org.KH.object1;

public class ComputeEx01 {

	public static void main(String[] args) {
	
		Compute01 edward = new Compute01();
		
		edward.fnc1();
		edward.fnc2(100);
		
		
//		edward.fnc3(); 는 바로 출력이 되지 않는다. 따라서..
		System.out.println(	edward.fnc3() );		//를 사용하거나
		
		int a = edward.fnc3()	;					//로 값을 설정한 a 이라는 변수를 만들어 출력을 해준다!
		System.out.println(a);
		
//		edward.fnc4(99); 는 바로 출력할 수 없다. 그래서..
		System.out.println( edward.fnc4(99) );		//를 사용하거나
		
		String score = edward.fnc4(99);				//로 값 99를 넣은 score 이라는 변수를 만들어 출력을 해준다!
		System.out.println(score);
		
	}

}
