package sec2;

public class CharStack {
	
	private StringBuffer stack;
	
	public CharStack() {
		stack = new StringBuffer();
	}
	
	public CharStack(int capacity) {
		stack = new StringBuffer(capacity);
	}
	
	public void push(char c) {	//한 글자씩 저장하기
		stack = stack.append(c);
	}
	
	public int pop() {			//한 글자씩 가져오기
		char ch = stack.charAt(stack.length()-1);
		stack = stack.deleteCharAt(stack.length()-1);
		return ch;
	}
	
	public char[] list() {		//문자배열로 변경하기
		char[] arr = stack.subSequence(0).toCharArray();
		return arr;
	}
	
	public String toString() {	//문자배열을 문자열로 변경하기
		return this.stack.toString();
	}

}
