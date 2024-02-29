package sec2;

public interface RemoteControl {
	
	int MAX = 10;				//MAX 와 MIN 은 상수가 된다.
	int MIN = 0;
	
	//추상 메소드(public 이다.)
	public void turnOff();
	public void turnOn();
	public void setVolume(int volume);
	
	
	// < 디폴트 메소드 (default Method) >
	//인터페이스에 메소드는 기본이 추상 메소드이므로 선언만 해야하며, 기본 접근 제한자는 public 이다.
	//그러나, 구현 내용을 기술하고 싶을 경우, 기본 접근 제한자 default로 명기하면 된다.
	default void setMute (boolean mute) {
		if(mute) System.out.println("무음 처리");
		else System.out.println("무음 해제");
	}
	
	
	//구현 내용 기술이 필요한 경우 static 으로 지시자를 선언하면 된다.
	default void changeBattery() {
		System.out.println("건전지 교체");
	}

	
}
