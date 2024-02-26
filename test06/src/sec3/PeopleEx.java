package sec3;


public class PeopleEx {

	public static void main(String[] args) {
		
		
		People p1 = new People ();
		p1.selNum = 200;
		p1.name = "계성우";
		p1.age = 26;
		p1.addr = "전농동	";
				
		People p2 = new People ();
		p2.selNum = 300;
		p2.name = "계현우";
		p2.age = 25;
		p2.addr = "청량리동";
	
		
		p1.selNum = 400;
		System.out.println(p1.selNum+ ", "+p1.name);
		System.out.println(p2.selNum+ ", "+p2.name);
		
		System.out.println("\n");
		
		p1.print1();
		p2.print1();
		
		System.out.println("\n");
		
		p1.print2();
		p2.print2();
		
		System.out.println("\n");
		
		//정적(Static)메소드 : 객체ㅢ 생성없이 해당하는 클래스에서 바로 활용하는 메소드
		System.out.println("정적 메소드");
		People.print2();
		People.selNum = 500;

	}

}
