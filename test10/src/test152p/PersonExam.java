package test152p;

/*
나이가 40살, 이름이 James라는 남자가 있습니다. 이 남자는 결혼을 했고, 자식이 셋 있습니다.
〈출력 결과〉
이 사람의 나이
이 사람의 이름
이 사람의 결혼 여부 이 사람의 자녀 수
힌트 1 클래스 이름은 보편적인 것으로 만드는 것이 좋습니다(Person 또는 Man).
힌트 2 클래스에서 사용할 멤버 변수를 생각해 보세요.
힌트 3 각 멤버 변수에 맞는 자료형을 생각해 보세요(결혼 여부 : boolean isMarried).
 */

public class PersonExam {

	public static void main(String[] args) {
		
		Person j = new Person();
		j.setAge(40);
		j.setName("Jason");
		j.setMarriage(true);
		j.setChild(3);	
		
		System.out.println(j.toString());

	}

}
