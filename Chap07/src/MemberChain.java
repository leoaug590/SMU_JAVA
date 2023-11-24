
public class MemberChain {
	String name;
	String country;
	int age;
	
	public MemberChain() {
		this("홍길순");
	}
	
	public MemberChain(String name) {
		this(name, 20);
	}
	
	public MemberChain(String name, int age) {
		this(name, age, "대한민국");
	}
	
	public MemberChain(String name, int age, String country) {
		this.name = name;
		this.country = country;
		this.age = age;
	}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("국적 : " + country);
		System.out.println("나이 : " + age);
	}
}
