package sec1;

public class OverloadEx1 {
	public static void main(String[] args) {
		
		Product pro1 = new Product ();
		pro1.print();
		pro1.print("성우");
		pro1.print(500);
	}
	
}
