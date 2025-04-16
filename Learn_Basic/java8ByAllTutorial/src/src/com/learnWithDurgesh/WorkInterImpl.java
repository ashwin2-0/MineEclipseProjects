package src.com.learnWithDurgesh;

public class WorkInterImpl {
	public static void main(String[] args) {
		WorkInter a = () -> System.out.println("Hello , Work Inter is getting called ");
		a.demo();
		// this is one way , but what if i don't wanted to write implementation then and wanted to 
		//refer a method which is written in some other class
		//so here we have refer static reference
		
		WorkInter b = Stuff :: doStuff;
		b.demo();
		// see this way i was saying 
		Runnable r = Stuff :: threadtask;
		Thread th = new Thread(r);
		th.start();
		// now lets try to refer non-static method 
		Stuff g = new Stuff();
		Runnable w = g :: nonStaticMethod;
		Thread jh = new Thread(w);
		jh.start();
	}
	

}
