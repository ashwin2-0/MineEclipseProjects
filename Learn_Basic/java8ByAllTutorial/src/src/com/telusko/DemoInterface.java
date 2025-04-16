package src.com.telusko;

public class DemoInterface {
	public static void main(String[] args) {
		Phone ph = new AndroidPhone();
		ph.call();
		
		ph.message();
		Phone.missCall();
		
	}
	

}
