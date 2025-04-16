package src.com.learnWithDurgesh;

public class SumImpl {
	public static void main(String[] args) {
		SumInter sum  = (a,b) ->  a+b ;
		int res = sum.add(28, 387);
		System.out.println(res);

	}
	
}
