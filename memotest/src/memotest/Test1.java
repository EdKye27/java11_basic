package memotest;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("2~9 사이 정수를 입력 : ");

            int input = sc.nextInt();

            if (input >= 2 && input <= 9) {
                for (int num = 1; num <= 9; num++) {
                    System.out.printf("%d * %d = %d\n", input, num, input * num);
                }
                break; // 올바른 입력을 받았으므로 루프를 종료합니다.
            } else {
                System.out.println("2 이상 9이하의 정수만 입력하세요.");
            }
        }

//        sc.close(); // Scanner 사용이 끝나면 닫아줍니다.
    }

}