import java.util.Scanner;
public class Loop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int choice = 1;
		while (choice == 1) {
			int a;
			
			System.out.println("숫자를 입력하세요.");
			a = s.nextInt();

			if (a % 2 == 0) {
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
			}
			
			System.out.println("계속 하려면 1, 그만하려면 0");
			choice = s.nextInt();
		}
		
		System.out.println("모든 숫자를 확인했습니다.");
	}

}
