package sec1;

public class Notebook implements Computer {
	
	@Override
	public void dispaly() {
		System.out.println("노트북 모니터 기본 해상도 : 1920 * 1080");
		
	}

	@Override
	public void typing() {
		System.out.println("노트북 내장된 키보드를 타이핑합니다.");
		
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("노트북의 전원을 켭니다.");
		else System.out.println("노트북의 전원을 끕니다.");
	}
	
	// Overloading 된 내용
	public void power(String name, boolean sw) {
		
	}

}
