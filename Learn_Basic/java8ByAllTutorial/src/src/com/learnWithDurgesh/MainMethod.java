package src.com.learnWithDurgesh;

public class MainMethod {
	public static void main(String[] args) {
		
		// this is traditional way to implment in ling way 
		MyInter my = new MyInterImpl();
		my.test();
		
		// so basically lets say suppose there are 100 implementation you need to do , Right so u need to write 
		// 100 impl class then , but why ?
		// here lambda comes into picture // by using anonymous class
		MyInter m1 = new MyInter() {
			
			@Override
			public void test() {
				System.out.println("Implementing myInter By using lambda First");
				
			}
		};
		MyInter m2 = new  MyInter() {
			
			@Override
			public void test() {
				System.out.println("Implementing MyInter using Lambda Second");
				
			}
		};
		m1.test();
		m2.test();
		
		// Now the same thing we can use  , instead of using Anonymous class we can create implementation by using lambda
		MyInter m3 = ()-> System.out.println("Implementing MyInter using actual lambda expression");
		// see here you have implemented interface method which is called as Consumer Interface
		m3.test();
		 
	}

}
