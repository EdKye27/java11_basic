package org.opentutorials.javatutorials;

public class ArrayLoopDemo {
	public static void main(String[] args) {
		
		String[] members = {"a", "b", "c"};
		for(int i = 0 ; i < members.length ; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}

	}
	
}
