package sec2;

public class StudentEx1 {

	public static void main(String[] args) {
		Student s1 = new Student ("계성우", 1, 100000);
		Student s2 = new Student ("계성우2", 2, 150000);
		Student s3 = new Student ("계성우3", 3, 200000);
		
		Bus bus1 = new Bus (101);
		s1.takeBus(bus1);
		s1.print();
		bus1.show();

		//계성우2 학생이 버스를 두 번 이용하고, 지하철을 2호선으로 세 번 이용하였을 경우
		//계성우2 학생의 정보와 버스 10호 정보와 지하철 2호선의 정보를 출력하여라
		
		Subway sub2 = new Subway (2);
		s2.takeBus(bus1);
		s2.takeBus(bus1);
		s2.takeSubway(sub2);
		s2.takeSubway(sub2);
		s2.takeSubway(sub2);
		
		s2.print();
		bus1.show();
		sub2.show();
	}

}
