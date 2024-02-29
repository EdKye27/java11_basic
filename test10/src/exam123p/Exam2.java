package exam123p;

// 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요.

public class Exam2 {
	
	public static void main(String[] args) {
		for(int i=2 ; i<=9 ; i+=2) {
			System.out.println(i +"단");
			for(int j=1 ; j<=9 ; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			
			System.out.println();
			
		}
	}
}
