package org.KH.app2;

public class Loop2 {

	public static void main(String[] args) {
		int[] ns = {9,12,3,7,6,8,10,11,};
		int max = 0;
		int min = ns[0];				//min 이 ns[0] 으로 하는 것은, 첫 번째 열의 숫자를 대상으로 비교해야 하기 때문! (0을 넣으면 0보다 작은 수는 없겠지?)
		
		for(int i=0;i<8;i++) {			// ns 열 안의 숫자들을 하나씩 보게 만드는 for 문
			if(ns[i]>max) max=ns[i];	//현재 ns 값이 max 값보다 더 클 때, 해당 값을 max 로 저장한다.
			if(ns[i]<min) min=ns[i];	//현재 ns 값이 min 값보다 더 작을 때, 해당 값을 min 로 저장한다.
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		

	}

}
