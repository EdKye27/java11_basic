package org.KH.java;

public class Variable6 {

	public static void main(String[] args) {
		float f1 = 3.14f;	//실수 float 는 f 붙히기
		double f2 = 3.14d;	//무조건 Double 로 할거야 라고 하면 d 붙히기, 의무 아님
		int kor=90, eng=80, mat=95;
		float avg = (kor + eng + mat) /3;
		//float avg = (kor + eng + mat) /3.0f;
		//float avg = (float) (kor + eng + mat) /3
		
		System.out.printf("\nf1=%f",f1);
		System.out.printf("\nf2=%.2f",f2);
		System.out.printf("\n평균 : %.2f",avg);

	}

}
