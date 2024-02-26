package sec2;

public class Bus {
	int no;		//노선번호
	int cnt;	//승객수
	int money;	//요금
	
	//객체 생성 시 노선번호만 입력받는 생성자 함수
	public Bus(int no) {	
		this.no = no;
	}
	
	//승객이 버스를 차면 행해지는 일 = 승객수가 늘어나고, 버스 매출이 늘어남
	public void take(int money) {
		this.money += money;			//매출 증가
		cnt++;							//승객 추가
	}
	
	//버스의 현재 정보 출력 (=toString.)
	public void show() {
		System.out.println("버스 번호 : " + this.no + ", 수익금액 : " + this.money + ", 누적 승객 : " + this.cnt);
	}
	
}
