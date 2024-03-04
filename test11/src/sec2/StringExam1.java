package sec2;

public class StringExam1 {

	public static void main(String[] args) {
		

		String name1 = "계성우";
		String name2 = new String("계성우");
		
		Integer su1 = 1004;
		String su2 = "1004";
//		// String su3 = new String(su1);
		String su3 = String.valueOf(su1);
		System.out.println( "su1 equals su2 : "+su1.equals(su2));
		System.out.println( "su2 equals su3 : "+su2.equals(su3));
		
		
		String str = "계성우/계성우2/계성우3/계성우4/계성우5";
		String[] names = new String[6];
		
		names = str.split("/");
		for(String s:names) {
			System.out.println(s);
		}
		
		String str2 = String.join("/", names);
		System.out.println(str2);
		
		
		
		
		
		
		String data = "    ivE\'s beaUty grOup/nnewJeans is firlGroup Top    ";

		char ten = data.charAt(9);				//10번째 문자(인덱스가 9인 문자)
		System.out.println(ten);
		
		String trimData = data.trim();			//앞 뒤의 공백을 제거하여 trimData에 저장
		System.out.println(trimData);
		
		int size = data.length();				//글자수를 data 에 저장
		int n = data;					//n의 글자 위치(인덱스)를 n 에 저장
		String up = data;				//모두 대문자로 변환하여 up 에 저장
		String down = data;				//모두 소문자로 변환하여 up 에 저장
		String sub1 = data;				//공백을 제거하고, 20번째 글자부터 27번째만 추출하여 sub1에 저장
		String sub2 = data;				//newJeans의 단어를 kepler로 변경하여 sub2에 저장
		byte[] girl = data;				//문자열을 girl 문자배열로 변환하여 저장
		
		
		
	}

}
