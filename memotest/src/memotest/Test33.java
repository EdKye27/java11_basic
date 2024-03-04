package memotest;

import java.util.ArrayList;
import java.util.List;

public class Test33 {
    public static void main(String[] args) {
        
        Member m1 = new Member();
        
        m1.setName("홍길동");
        m1.setAge(25);
        m1.setAddress("서울시 동대문구");
        m1.setHobby("독서");
        
        Member m2 = new Member();
        
        m2.setName("홍길동");
        m2.setAge(25);
        m2.setAddress("서울시 동대문구");
        m2.setHobby("독서");
        
        List<Member> list = new ArrayList<Member>();
        
        list.add(m1);
        list.add(m2);
        
        for(Member mem : list) {
            System.out.println("이름: " + mem.getName());
            System.out.println("나이: " + mem.getAge());
            System.out.println("주소: " + mem.getAddress());
            System.out.println("취미: " + mem.getHobby());
        }
    }   
}
