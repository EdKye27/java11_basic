package org.KH.app2;

public class Loop3 {
	public static void main(String[] args) {
		// 80점 이상일 경우 합격
		int[] nums = {80,95,75,60,100,65,70,90,85,95};
		/* 		 중요한 자바 1.6 이상의 개선된 for 문		 */
		for(int n : nums) {
			if(n>=80) System.out.println(n+" → 합격");
			else System.out.println(n+" → 불합격");
		}
	
		nums[10] = 55;
		for(int i=0;i<nums.length;i++) {
			System.out.println(i+"="+nums[i]);
		}
	}

}
