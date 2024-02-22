package org.KH.app;

import java.util.Scanner;

// 조건문 다단계 if
public class Condition4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력[0-100] : ");
		int point = scan.nextInt();
		String result = null;
		
		/* 예제!
		 * 학점 (result) 은 점수 (point) 가
		 * 97~100 이면 'A++', 93~96이면 'A0', 90~92이면, 'A-'
		 * 87~89 이면 'B++', 83~86이면 'A0', 80~82이면, 'A-'
		 * ...
		 * 60점 미만이면 'F' 로 하되, 다단계 if 와 if/elseif/else 문 활
		 * 'A-' 이면 '아차상' 으로 하고, 나머지는 ''으로 하되, switch~case~문 활
		 * 
		 */
		
		if(point>=97) {result = "A++";}
        else if(point>=93) {result = "A0";}
        else if(point>=90) {result = "A-";}
        else if(point>=87) {result = "B++";}
        else if(point>=83) {result = "B0";}
        else if(point>=80) {result = "B-";}
        else if(point>=77) {result = "C++";}
        else if(point>=73) {result = "C0";}
        else if(point>=70) {result = "C-";}
        else if(point>=67) {result = "D++";}
        else if(point>=63) {result = "D0";}
        else if(point>=60) {result = "D-";}
        else if(point<60) {result = "F";}

        System.out.printf("당신의 점수는 %d 점 입니다.\n", point);     
        System.out.println("당신의 학점은 "+result+" 입니다.");
        
        if(result.equals("A-")) {
            System.out.println("당신에게 아차상을 수여합니다.");
        } else {
            System.out.println(" ");
        
        }
	}
}