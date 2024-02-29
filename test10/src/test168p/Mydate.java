package test168p;

class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	
	public MyDate() {
		// 기본 생성자 구현
	}
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	// 날짜 유효성 검사
	public boolean isValid() {
		if (month < 1 || month > 12) // 월은 1부터 12까지의 값이어야 합니다.
			return false;
		if (day < 1) // 일은 1보다 크거나 같아야 합니다.
			return false;
		if (month == 2) { // 2월의 경우
				return day <= 28; // 28일까지 유효합니다.
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) { // 4, 6, 9, 11월의 경우
			return day <= 30; // 30일까지 유효합니다.
		}
		return day <= 31; // 나머지 달은 31일까지 유효합니다.
	}

}
