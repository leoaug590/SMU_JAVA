
public class SubKitten2 extends SuperCat2 {
	String name;
	String age = "2살";
	
	public SubKitten2(String nameP, String nameK) {
		super(nameP);
		this.name = nameK;
		
		System.out.println("아기 고양이입니다. 이름은 " + this.name);
	}
}
