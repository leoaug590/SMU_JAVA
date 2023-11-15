import java.util.Scanner;
public class Loop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		System.out.println("5개의 숫자를 입력하세요.");
		
		for (int i = 1; i <= 5; i++) {
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			sum += num;
		}
		
		System.out.println("합계 : " + sum);
		
		
	}

}
