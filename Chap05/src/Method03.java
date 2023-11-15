
public class Method03 {
	

	public static void main(String[] args) {

		int a = 5, b = 6;
		int num = max(a, b);
		System.out.println(a + "와(과) " + b + "의 수 중 " + num + "이 큽니다.");
	}

	public static int max(int x, int y) {
		// TODO Auto-generated method stub
		int result;
		if (x > y) {
			result = x;
		}
		else {
			result = y;
		}
		return result;
	}


}
