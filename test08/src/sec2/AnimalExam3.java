package sec2;

//import sec2.Animal; 					// 같은 패키지에 있으므로 끌고 올 필요 없음
//import sec2.Mammal;					// 같은 패키지에 있으므로 끌고 올 필요 없음
//import sec2.Birds;					// 같은 패키지에 있으므로 끌고 올 필요 없음

public class AnimalExam3 {
	public static void main(String[] args) {
		
		Animal a1;						//Animal 객체 선언
		a1 = new Animal();
		a1.setName("토끼");
		a1.setSpine(true);
		a1.print();

		a1 = new Mammal();
		a1.setName("사자");
		System.out.println(a1.print());

		a1 = new Birds();
		a1.setName("독수리");
		a1.setSpine(true);
		
		System.out.println(a1.print());
		
		
	}
	

}
