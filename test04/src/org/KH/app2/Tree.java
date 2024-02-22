package org.KH.app2;

public class Tree {

	public static void main(String[] args) {
	int height = 5; // 크리스마스 트리의 높이
	        
	        // 트리의 각 줄에 대한 반복
	        for (int i = 0; i < height; i++) {
	            // 공백 출력
	            for (int j = 0; j < height - i - 1; j++) {
	                System.out.print(" ");
	            }
	            // 별 출력
	            for (int k = 0; k < 2 * i + 1; k++) {
	                System.out.print("*");
	            }
	            System.out.println(); // 줄바꿈
	        }
	        
	        // 트리의 줄끝에 기둥 출력
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < height - 1; j++) {
	                System.out.print(" ");
	            }
	            System.out.println("*");
	        }
	    }
	}