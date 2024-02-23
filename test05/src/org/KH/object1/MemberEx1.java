package org.KH.object1;

public class MemberEx1 {

	public static void main(String[] args) {
		Member kye = new Member ();
		
		kye.setId("peterkye");						//kye.id = "peterkye";
		kye.setPw("password");						//kye.pw = "password";
		kye.setEmail("sungwookye@gmail.com");		//kye.email = "sungwookye@gmail.com";
		kye.setBirth("1999.02.07");					//kye.birth = "19990207";
		kye.setTel("010-8484-8905");				//kye.tel = "010-8484-8905";
		
		System.out.println(kye.toString());
		System.out.println("id : "+ kye.getId());
		System.out.println("pw; " + kye.getPw());
		System.out.println("email; " + kye.getEmail());
		System.out.println("birth; " + kye.getBirth());
		System.out.println("tel; " + kye.getTel());	
		
		
	}

}
