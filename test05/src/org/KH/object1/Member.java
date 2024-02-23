package org.KH.object1;
// public > protected > default > private
// .(모두) > 동일/상속/연관   동일     현재클래스

public class Member {	
	private String id;
	private String pw;
	private String email;
	private String birth;
	private String tel;
	
//우클릭 Source - getters & setters 활용하여 아래 구문 불러오
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getBirth() {
		return birth;
	}	
	public void setBirth(String birth) {
		this.birth = birth;
	}


	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}



//우클릭 Source - Override
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}
	
}
