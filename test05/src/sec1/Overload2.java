package sec1;

public class Overload2 {

	public static void main(String[] args) {
		
		Book b1 = new Book ();
		b1.setBno (1);
		b1.setBname ("세계정복 공략 1권");
		b1.setAuthor ("계성우");
		b1.setPrice (30000);
		b1.setPub ("KH출판");
		
		Book b2 = new Book ();
		b2.setBno (2);
		b2.setBname ("세계정복 공략 2권");
		b2.setAuthor ("계성우2");
		b2.setPrice (30000);
		b2.setPub ("KH출판");
		
		Book b3 = new Book ();
		b3.setBno (3);
		b3.setBname ("세계정복 공략 3권");
		b3.setAuthor ("계성우");
		b3.setPrice (30000);
		b3.setPub ("KH출판");
	
//		Book b4 = new Book () ;
//		b4.print();
//		b4.print( b1.getBname(), b1.getPrice(), b1.getAuthor() );
//		b4.print( b2.getBname(), b2.getPrice(), b2.getAuthor() );
//		b4.print( b3.getBname(), b3.getPrice(), b3.getAuthor() );


		
	}

}
