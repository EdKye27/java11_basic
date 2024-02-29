package sec5;
//Queue : FIFO 구조 - First In First Out 구조 : Task(작업) 순서의 스케줄
//Stack : LIFO 구조 - Last In First Out 구조 : 최근 작업 목록
public class BookShelfExam {

	public static void main(String[] args) {
		Queue que = new BookShelf();
		que.enQueue("해리포터와 마법사의 돌");
		que.enQueue("해리포터와 불의 잔");
		que.enQueue("해리포터와 아즈카반의 죄수");
		
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());

	}

}
