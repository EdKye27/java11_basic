package sec1;

public class AnimalExam1 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Mammal();
		Animal a3 = new Birds();
		
		// Mammal m1 = new Animal(); 		//자식 클래스는 부모 클래스를 생성할 수 없다
		Mammal m2 = new Mammal();
		// Mammal m3 = new Birds();			//자식 클래스끼리 생성될 수도 없다
		
		Animal a4;				//선언 먼저, 객체 생성은 나중에
		a4 = new Animal();		//Animal 객체 생성
		a4.setName("구렁이");
		a4.setSpine(true);
		System.out.println(a4.print());
		
		a4 = new Mammal();		//Mammal 객체로 '형 변환'
		// a4.setLegs();		//a4는 Animal 객체로 Legs 가 실행될 수 없다
		a4.setName("호랑이");
		a4.setSpine(true);
		System.out.println(a4.print());
		
		a4 = new Birds();		//Birds 객체로 '형 변환'
		a4.setName("갈매기");
		System.out.println(a4.print());
		
		//메소드 오버라이딩 : 부모 클래스로부터 상속 받은 메소드를 다르게 구현
		//그러므로, 분모 클래스로 선언된 객체는 부모 자신 또는 자식 생성자를 활용하여 다양하게 '형 변환' 할 수 있다.
		
		//Class 특징 → 캡슐화, 정보 은닉, 재사용성, 다형성, 추상화
	}

}
