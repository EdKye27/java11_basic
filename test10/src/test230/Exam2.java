package test230;

//문제2. 206쪽의 알파벳 출력 예제에서 각 배열 요소 값을 소문자에서 대문자로 변환해 출력하세요.	

public class Exam2 {
    public static void main(String[] args) {
    
        char[] arr = {'M', 'e', 'r', 'r', 'y', 'c', 'h', 'r', 'i', 's', 't', 'm', 'a', 's'};
        char[] obj = new char[arr.length];
        for(int i=0 ; i<arr.length ; i++) {
            int a = arr[i];
            if(a>=97) {
                obj[i] = (char) (a - 32);
            } else {
                obj[i] = arr[i];
            }
            System.out.print(obj[i]); // 변환된 문자를 출력
        }
    }
}
