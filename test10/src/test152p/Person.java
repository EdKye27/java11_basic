package test152p;

public class Person {
	
	private int age;
	private String name;
	private boolean marriage;
	private int child;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarriage() {
		return marriage;
	}
	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	
	@Override
	public String toString() {
		return "Person\n나이 = " + age + "\n이름 = " + name + "\n결혼 여부 = " + marriage + "\n아이 수 = " + child;
	}

}
