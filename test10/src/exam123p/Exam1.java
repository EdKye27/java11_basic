package exam123p;

// operator 값이 +， *, /인 경우에 사칙 연산을 수행하는 프로그램을 if-else if문과 switch- case문을 사용해 작성해 보세요.

public class Exam1 {

	public static void main(String[] args) {
		
		//if ~ else if ~ 문을 활용한 문제 풀이.
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		if(operator == '+') {
			result = num1+num2;
		} else if(operator == '*') {
			result = num1 * num2;
		} else if(operator == '-') {
			result = num1 - num2;
		} else if(operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		System.out.println("결과는  : " + result);
	}

}
