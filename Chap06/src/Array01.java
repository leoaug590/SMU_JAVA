import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {

		String[] myArr;
		myArr = new String[3];

		Scanner s = new Scanner(System.in);
		
		System.out.println("3개의 문자열을 입력하세요.");
		
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = s.nextLine();
		}
		
		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + " ");
		}
		
	}

}
