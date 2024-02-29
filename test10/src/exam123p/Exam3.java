package exam123p;

// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지 만 출력하는 프로그램을 만들어 보세요. (break문 사용)

public class Exam3 {
		public static void main(String[] args) {
			
			for(int i=2 ; i<=9 ; i++) {
				System.out.println(i +"단");
				for(int j=1 ; j<=i ; j++) {
					System.out.println(i + "*" + j + "=" + (i*j));
				}
				
				System.out.println();				
			}
		}
	}
