package sec3;
// 특정 변수가 영향을 미치는 범위 : Scope
public class ScopeExam {

	int a = 10;				//전역 변수 (Global Scope)
	static int b = 100;		//클래스 변수 (Class Scope)
	
	public static void main(String[] args) {
		int a = 20;		//지역변수 (Local Scope)
		System.out.println("지역변수 a = " +a);
		run();
		run(30);
	}
		
	public static void run() {
		System.out.println("클래스 변수 b = " +b);
	}
	
	public static void run(int a) {	//매개 변수 (=Local Scope)
		System.out.println("매개 변수	a = "+a);
	}
		

}
