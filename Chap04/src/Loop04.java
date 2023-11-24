import java.util.Scanner;
public class Loop04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("길이 : ");
		
		int len = s.nextInt();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * len) - 1 - (i * 2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
