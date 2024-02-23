public class Book {
    private int bno;
    private String bname;
    private int price;
    private String author;
    private String pub;

    // 생성자
    public Book(int bno, String bname, int price, String author, String pub) {
        this.bno = bno;
        this.bname = bname;
        this.price = price;
        this.author = author;
        this.pub = pub;
    }

    // Getter 및 Setter 메소드
    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    // 출력 메소드
    public void print() {
        System.out.println("교재 코드: " + bno);
        System.out.println("교재명: " + bname);
        System.out.println("가격: " + price);
        System.out.println("저자: " + author);
        System.out.println("출판사: " + pub);
    }

    // 매개변수 개수에 따라 다른 출력 메소드
    public void print(String... args) {
        for (String arg : args) {
            switch (arg) {
                case "bno":
                    System.out.println("교재 코드: " + bno);
                    break;
                case "bname":
                    System.out.println("교재명: " + bname);
                    break;
                case "price":
                    System.out.println("가격: " + price);
                    break;
                case "author":
                    System.out.println("저자: " + author);
                    break;
                case "pub":
                    System.out.println("출판사: " + pub);
                    break;
                default:
                    System.out.println("잘못된 매개변수입니다.");
            }