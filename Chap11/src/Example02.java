
public class Example02 {

	public static void main(String[] args) {
		try {
			Integer in = new Integer("abc"); // 문자열을 숫자로 변경하여 발생
			in.intValue();
		}
		catch (ArithmeticException e) {
			System.out.println("예외 발생 ArithmeticException " + e);
		}
		catch (NumberFormatException e) {
			System.out.println("예외 발생 NumberFormatException " + e);
		}
		System.out.println("try~catch 문의 외부 문장입니다.");

	}

}
