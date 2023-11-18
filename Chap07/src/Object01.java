
public class Object01 {

	public static void main(String[] args) {
		Student stObj1 = new Student();
		
		stObj1.id = 2020218018;
		stObj1.name = "김성진";
		stObj1.printInfo();
		
		Student stObj2 = new Student();
		stObj2.insertRecord(2020218018, "김성진");
		stObj2.printInfo();
	}

}
