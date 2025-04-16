package src.com.learnWithDurgesh;

public class ConsRefMain {

	public static void main(String[] args) {
		System.out.println("Learning Constructor Reference.");
		Provider p = new Provider() {

			@Override
			public Student getStudent() {
				return new Student();
			}
		};
		Student st = p.getStudent();
		st.display();
		
		// this is one way ,but what if some shortcut way
		Provider r = Student :: new ; // here new means we are referring constructor reference
									// ClassNama :: new
		Student st2 = r.getStudent();
		st2.display();
	}
}
