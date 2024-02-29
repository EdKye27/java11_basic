package sec4;

public class Market implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void delivery() {
		System.out.println("배송하기");
		
	}

}
