package sec1;

public class Tablet implements Computer {

	@Override
	public void dispaly() {
		System.out.println("태블릿의 모니터 기본 해상도 : 640 * 960");
		
	}

	@Override
	public void typing() {
		System.out.println("태블릿은 문자표에서 해당 글쇠를 터치합니다.");
		
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("태블릿의 전원을 켭니다.");
		else System.out.println("태블릿의 전원을 끕니다.");
	}
	
	// Overloading 된 내용
	public void power(String name, boolean sw) {
		
	}
	
}
