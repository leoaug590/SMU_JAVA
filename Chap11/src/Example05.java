
public class Example05 {
	static void check() {
		System.out.println("내부 메서드");
		throw new ArithmeticException("5/0");
	}
	
	
	public static void main(String[] args) {
		try {
			check();
		} catch (ArithmeticException e) {
			System.out.println("예외 발생 " + e);
		}

	}

}
