package data;

public class J05_People {

	String name;
	int age;
	
	public J05_People(
				String name, String rAge) {

		this.name = name;
		this.age = Integer.parseInt(rAge);
	}
	
	public String toString() {
		return "이름 : " + name + ", 나이 : "
				+ age;
	}

	public String getName() {
		return name;
	}
	
}




