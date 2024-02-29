package exam02;

public class GugudanExam {

    public static void main(String[] args) {
    	System.out.println("************* 구구단 머신 ************* \n");
        for(int i = 1; i <= 9; i++) {					//행
            for(int j = 2; j <= 9; j++) {				//열
                System.out.print(j + "x" + i + "=" + (j * i) + "\t");
            }
            System.out.println(); // 한 줄 출력 후 줄 바꿈
        }        
    }
}
