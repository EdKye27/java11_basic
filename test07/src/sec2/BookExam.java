package sec2;

public class BookExam {

	public static void main(String[] args) {
		
	/*
		//100개의 Book 배열 선언
		Book[] book = new Book[100];
		for(int i=0;i<10;i++) {
			book[i] = new Book("책 제목" +i , "저자" +i);
		}
	*/
	
		// 5개의 Book 객체 생성 및 배열에 할당
				Book[] book = new Book[5];
				book[0] = new Book("자바 프로그래밍 입문", "박은종");
				book[1] = new Book("HTML/CSS", "전은철");
				book[2] = new Book("집에 가고싶어요", "계성우");
				book[3] = new Book("열심히 노력하자", "계성우2");
				book[4] = new Book("아직 갈길이 멀다", "계성우3");		
				
				// 모든 Book 객체 정보 출력
				for (int i = 0; i < 5; i++) {
					System.out.println(book[i].toString());
				}		
			}
		}