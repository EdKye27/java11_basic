package sec1;
// Animal (부모 클래스 = super.) , Mammal (자식 클래스 = sub)
public class Mammal extends Animal {		//Animal 로부터 모든 멤버를 상속받은 Animal 클래

	private int leg;

	
	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public String print() {
		return "Mammal [name+ "+super.name+", spine+ "+super.isSpine()" + leg+ "super.isSpine()"]";
	}
	
	
	
	
	
}
