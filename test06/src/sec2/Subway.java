package sec2;

public class Subway {
	
	int no;
	String station;
	int money;
	int cnt;
	
	// 지하철 노선번호를 매개변수로 받는 생성자 함수
	public Subway (int no) {
		this.no = no;
	}
	
	// 지하철 승객이 지하철을 탑승해서 생기는 변화 : 탑승객 + / 매춭 +
	public void take(int money) {
		this.money += money;			// 돈 낸 요금대로 매출 +
		cnt++;							// 돈 낸 사람 있으니 승객 +1
	}

	//현재 지하철 정보 출력
	public void show () {
		System.out.println("지하철 : " + this.no + "호선, " + +", 현재 매출은" + this.money +"원, 현재 탑승객은 " + this.cnt + "명 입니다.");
	
	}

}
