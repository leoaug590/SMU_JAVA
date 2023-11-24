
public class Constructor02 {

	public static void main(String[] args) {
		System.out.println("****학생 주소록****");
		Student stObj1 = new Student();
		
		stObj1.insertRecord(2020218018, "김성진");
		stObj1.printInfo();

		Student stObj2 = new Student(2020218018, "김성진");
		stObj2.printInfo();
	}

}
