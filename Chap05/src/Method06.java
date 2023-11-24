
public class Method06 {
	
	public static double sum(double x, double y) {
		// TODO Auto-generated method stub
		return (x + y);
	}
	
	public static int sum(int a, int b, int c) {
		// TODO Auto-generated method stub
		return (a + b + c);
	}
	
	public static int sum(int x, int y) {
		// TODO Auto-generated method stub
		return (x + y);
	}

	public static void main(String[] args) {
		System.out.println("sum(10, 20)의 값 : " + sum(10, 20));
		System.out.println("sum(10, 20, 30)의 값 : " + sum(10, 20, 30));
		System.out.println("sum(10.5, 20.5)의 값 : " + sum(10.5, 20.5));
	}


}
