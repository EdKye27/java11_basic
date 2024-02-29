package sec5;

import java.util.ArrayList;
//일반(구현) 클래스
public class Shelf {
	protected ArrayList<String> shelf;		//List<String> → "peterkye", "edkye" ...
	protected Shelf() {
		shelf = new ArrayList<String>();
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	
	public int getCount() {
		return shelf.size();
	}
	
	
	

}
