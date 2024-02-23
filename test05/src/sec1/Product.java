package sec1;

public class Product {

	// 정보은닉을 위해 private 로 진행한다.
	private String pname;
	private int pcode;
	private int price;
	private int size;
	private int amount;
	private String remark;
	
	
	// 메소드 오버로딩	(Method Overload)
	public void print () {
		System.out.println("제품정보 : ");
	}
	
	public void print (String pname) {
		System.out.println("제품이름 : " + pname);
	}
	
	public void print (int pcode) {
		System.out.println("제품번호 : " +pcode);
	}
	
	public void print (int price) {
		System.out.println("제품가격 : " +price);
	}
	
	public void print (int size) {
		System.out.println("제품사이즈 : " +size);
	}
	
	public void print (int amount) {
		System.out.println("제품제고 : " +amount);
	}
	
	public void print (String remark) {
		System.out.println("제품 비고 : " + remark);
	}
	
	
	
	
	//getters and setters
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pcode=" + pcode + ", price=" + price + ", size=" + size + ", amount="
				+ amount + ", remark=" + remark + "]";
	}
	
}
