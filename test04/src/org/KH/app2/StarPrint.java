package org.KH.app2;
// 중첩 For 문을 활용한 별 찍기
public class StarPrint {

	public static void main(String[] args) {
		/*
		 
		 ******
		 ******
		 ******
		 ******
		 
		 ~ 을 출력해보자
		 
		 */

//		for(int i=0 ; i<4 ; i++) {			// 0 ~ 3 까지 4번 실행됨
//			for(int j=0 ; j<6 ; j++ ) {		// i 가 실행 될 때마다 0 ~ 5 까지 6번 실행되어 총 24번 실행됨
//				System.out.print("*");	// * 24개 찍힘
//			}
//			System.out.println();
//		}
		
		// 트리 만들기
//		for (int i = 1; i <= 6; i++) { // 행
//			for (int j = 1; j <= i; j++) { // 열
//			System.out.print("*");
//			}
//		System.out.println(); // 한 행 출력 후 줄바꿈
//		}
		
		//역 트리 만들기
		for (int i = 6; i >= 1; i--) { // 행
            for (int j = 1; j <= i; j++) { // 열
                System.out.print("*");
            }
            System.out.println(); // 한 행 출력 후 줄바꿈
        }
    }
}
