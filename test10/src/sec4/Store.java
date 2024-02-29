package sec4;
//다중 상속 안됨
//public class Pay extends Inventory 를 입력해두어야 한다!
public class Store extends Pay {

	@Override
	public void pay() {
		System.out.println("상점");
		super.pay();
	}

	@Override
	public void inventory() {
		System.out.println("상점");
		super.inventory();
	}
	
	
	
}
