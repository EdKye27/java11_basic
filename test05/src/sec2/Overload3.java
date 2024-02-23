package sec2;

public class Overload3 {

    public static void main(String[] args) {

        Board b1 = new Board();
        b1.setBno(207);
        b1.setTitle("인사드립니다!");
        b1.setUname("계성우");

        System.out.println(b1.getBno() + "\n" + b1.getTitle() + "\n" + b1.getUname());
    }

}