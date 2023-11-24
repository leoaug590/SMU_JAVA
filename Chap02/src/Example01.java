
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int SPEED = 20; // final 키워드를 사용하면 상수로 선언
		int count = 10;
		// SPEED = 40; 상수는 값을 변경할 수 없으므로 오류 발생
		count = 11;
		System.out.print("상수 SPEED 값은 : ");
		System.out.println(SPEED);
		System.out.print("변수 count 값은 : ");
		System.out.println(count);
		
		// 상수(constant)는 변수와 마찬가지로 데이터를 저장하는 메모리 공간이지만
		// 프로그램이 실행되는 동안 메모리에 저장된 데이터를 변경할 수 없고
		// 반드시 선언과 동시에 초기화 해야한다. 상수는 final 키워드를 사용해 선언한다
	}

}
