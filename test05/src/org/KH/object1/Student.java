package org.KH.object1;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	
//	내가 쓴 답은..	
//	int tot = ((int)kor + (int)eng + (int)math);
//	int avg = ((int)tot / 3.0f);
	
	int tot() {
		return this.kor+this.eng+this.math;
	}
	double avg() {
		return (this.kor+this.eng+this.math) / 3.0f;
	}
	
	void resulting () {
		System.out.println("이름 : "+this.name+" \t 총점 : " + this.tot() + "\t 평균 : "+this.avg());
	}
	

}
