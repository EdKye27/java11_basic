package exam01;

import java.util.Scanner;

public class CalorieExam {

	public static void main(String[] args) {
	
	int calorie;
	int protein;
	int carbonhydrate;
	int fat;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("단백질 : ");
	protein = scanner.nextInt();
	
	System.out.println("탄수화물 : ");
	carbonhydrate = scanner.nextInt();
	
	System.out.println("지방 : ");
	fat = scanner.nextInt();
	
	calorie = protein*4 + carbonhydrate*4 + fat*9;
			System.out.println("총 칼로리 : " +calorie);

	}

}
