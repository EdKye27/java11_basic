package sec1;

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		
//		내가 작성한 답안은..
//		Student s1 = new Student ();
//		s1.setNo(1);
//		s1.setKor(100);
//		s1.setEng(90);
//		s1.setMath(87);
//		
//		s1.studentInfo();
//		s1.sum();
//		s1.level();
		
		// 5명의 학생의 국,영,수 점수를 넣을 수 있는 란을 만들자!
		
		//5명의 학생 객체 선언
		Student[] s = new Student[5];
		Scanner scn = new Scanner(System.in);		//키보드로 값을 입력받기 위해 Scanner 선언
		for(int i = 0; i < 5; i++) {
		    s[i] = new Student();                   
		    s[i].setNo(i + 1);  // 학생 번호는 1부터 시작하도록 설정
		    System.out.print((i + 1) + "번째 국어 : ");
		    s[i].setKor(scn.nextInt());
		    System.out.print((i + 1) + "번째 영어 : ");
		    s[i].setEng(scn.nextInt());
		    System.out.print((i + 1) + "번째 수학 : ");
		    s[i].setMath(scn.nextInt());			
		}
		
		
		 System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t");
	        for(int i = 0; i < 5; i++) {
	            s[i].print();
		}
		
	}
}
