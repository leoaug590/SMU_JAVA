
public class Example01 {

	public static void main(String[] args) {
		BabyCat catObj = new BabyCat();
		
		System.out.println("품종 : " + catObj.breed); // 부모에게 상속
		System.out.println("색상 : " + catObj.color); // 본인 멤버
		
		catObj.eat();	// 부모에게 상속
		catObj.meow();  // 본인 멤버
	}

}
