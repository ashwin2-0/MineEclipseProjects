package sr.com.javaBrains;

public class HelloWorld {
	public static void main(String[] args) {
		Lambda myfunc = () -> System.out.println("Hello World"); // this way we can used
		Addition myadd = ( a, b) -> {
			int ans = a + b;
			System.out.println("Sum is :" + ans);
			return ans;

		};
		myfunc.foo();
		myadd.add(89, 28);
	}

}

interface Lambda {
	void foo();
}

interface Addition {
	int add(int a, int b);
}