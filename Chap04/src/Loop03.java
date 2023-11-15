import java.util.Scanner;
public class Loop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("10보다 큰 숫자를 입력하세요.");
		
		int x = s.nextInt();
		int sum = 0;
		do {
			sum += x;
			x --;
		} while (x >= 10);
		System.out.println("합계 : " + sum);
	}

}
