package sec1;

// 필드 : 번호, 국어점수, 영어점수, 수학점수
// 메소드 : getter/setter, 및 총점, 평균, 학점, 모든 정보 출력

public class Student {
    int no;
    int kor;
    int eng;
    int math;

    
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    
    @Override
    public String toString() {
        return "Student [no=" + no + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
    }

    
    // 합산점수 확인하기
    public int sum() {
        return this.kor + this.eng + this.math;
    }

    // 평균 점수 확인하기
    public double avg() {
        return (double) this.sum() / 3;
    }

    // 학점 정보 확인하기
    public String level() {
        String grade;

        if (this.avg() >= 90) {
            grade = "A";
        } else if (this.avg() >= 80) {
            grade = "B";
        } else if (this.avg() >= 70) {
            grade = "C";
        } else if (this.avg() >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        return grade;
    }

    // 모든 정보 출력
    public void print() {
        System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s%n", this.no, this.kor, this.eng, this.math, this.sum(), this.avg(), this.level());
    }
}