package Scheduler;

import java.io.IOException;

public class ScheduleExam {

    public static void main(String[] args) throws IOException {
        
        /*
         
        [문제]
         키보드로 알파벳을 입력받아 입력 값이 R 이면 RoundRobin 의 객체가,
         P 이면 PriorityAllocation 의 객체가,
         L 이면 LeastJob의 객체가 생성되고,
         그 밖의 문자가 입력되면 "지원하지 않는 스케줄링입니다." 를 출력
         입력 문자는 대문자와 솜누자 모두 입력 가능하도록 비교하여야 함. 
         
         */
        
        // Scanner scanner = new Scanner(System.in);
        
        
        Scheduler s = null;
        System.out.println("전화 상담 방식 선택 [A-Z] : ");
        int ch = System.in.read(); // 나중에 배울 개념! 예외 처리
        
        if(ch == 'R' || ch == 'r') {
            s = new RoundRobin();
        } else if(ch == 'P' || ch == 'p') {
            s = new PriorityAllocation();
        } else if(ch == 'L' || ch == 'l') {
            s = new LeastJob();
        } else {
            System.out.println("지원하지 않는 스케줄입니다.");    
            return;
        }
        
        s.getNextCall();
        s.sendCallToAgent();
        
    }
}
