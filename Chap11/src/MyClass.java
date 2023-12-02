
public class MyClass {
	static boolean isCapitalized(String s) {
		if (s == null) {
			throw new NullPointerException();
		}
		if (s.equals("")) {
			return true;
		}
		String first = s.substring(0, 1);
		String rest = s.substring(1);
		return (first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase()));
	}
	public static void main(String[] args) {
		String str_not_null = "Java";
		String str_is_null = null;
		
		System.out.println(str_not_null + "가 대문자인가?" + isCapitalized(str_not_null));
		System.out.println(str_is_null + "가 대문자인가?" + isCapitalized(str_is_null));
	}
}
