package lambdaexpressions;

import java.util.stream.IntStream;

public class StrongNumber {
 
	public static void main(String[] args) {
//		sum of factorial of each digit is equal to that number
		int n=145;
		
		boolean result=String.valueOf(n).chars().map((x)-> IntStream.rangeClosed(1,x-48).reduce(1, (a,b)->a*b)).sum()==n;
		
		System.out.println(result);
		
		
		
		
	}
}
