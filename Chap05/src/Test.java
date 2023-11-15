import java.util.Scanner;

public class Test {
	static int inputMethod() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	static void display(int a) {
		System.out.println("입력된 숫자 : " + a);
	}				
	public static void main(String[] args) {
		int a = inputMethod();
		display(a);
	}
}
