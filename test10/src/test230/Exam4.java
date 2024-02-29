package test230;

/*
 다음과 같이 Dog 클래스가 있습니다.
 DogTest클래스와 배열 길이가 5인 Dog[]배열 을 만든 후
 Dog 인스턴스를 5개 생성하여 배열에 추가합니다. for문과 향상된 for문에서
 Dog 클래스 의 showDoglnfot) 메서드를 사용하여 배열에 추 가한 Dog 정보를 모두 출력하세요.
 */

public class Dog {
	public static void main(String[] args) {
		
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("눈탱이", "치와와");
		dog[1] = new Dog("재롱이", "시츄");
		dog[2] = new Dog("누렁이", "진돗개");
		dog[3] = new Dog("초코", "푸들");
		dog[4] = new Dog("복슬이", "삽살개");
		System.out.println("일반 for문 출력");
		
		for(int i=0 ; i<dog.length ; i++) {
			System.out.println(dog[i].show);
		}
		
		System.out.println("향상된 for문 출력");
		for(Dog d:dog) {
			System.out.println(d.show());
		}
		
	}
}
