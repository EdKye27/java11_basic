package exam123p;

public class Exam4 {
    public static void main(String[] args) {
        
        for(int i = 3; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 7 - 2*i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
