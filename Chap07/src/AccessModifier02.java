
public class AccessModifier02 {

	public static void main(String[] args) {
		Dog dogObj = new Dog();
		
		dogObj.breed = "포메라니안";
		dogObj.color = "갈색";
		
		System.out.println("강아지 품종 : " + dogObj.breed);
		System.out.println("강아지 색상 : " + dogObj.color);
		
		dogObj.bowwow();
		dogObj.age = 10;
		
		System.out.println("강아지 나이 : " + dogObj.age);
		dogObj.run();
	}

}
