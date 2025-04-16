package com.practise.any;

@FunctionalInterface
interface Fucntional{
	int operation(int a,int b);
}


public class FunctionalDemo1 {
	public static void main(String[] args) {
		Fucntional sum = (a,b) -> a+b; 
		Fucntional multiply = (a,b) -> a*b ;
		
		System.out.println("Sum :"+sum.operation(243, 34));
		System.out.println("Multiple :"+ multiply.operation(4, 9));
	}

}
