
public class Example03 {

	public static void main(String[] args) {
		int a[] = new int[2];
		
		try {
			System.out.println("잘못된 요소에 접근 : " + a[3]);
		} catch (Exception e) {
			System.out.println("에외 발생 ArrayIndexOutOfBoundException " + e);
		} finally {
			System.out.println("finally는 항상 실행됩니다.");
		}
		
	}

}
