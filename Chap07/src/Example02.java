
public class Example02 {
	static void myMethod1() {
		System.out.println("정적 메서드 호출");
	}
	
	public void myMethod2() {
		System.out.println("인스턴스 메서드 호출");
	}
	
	public static void main(String[] args) {
		myMethod1();
		//myMethod2(); 컴파일 오류
		
		Example02 Obj = new Example02();
		Obj.myMethod1();
		Obj.myMethod2();
		
	}

}
