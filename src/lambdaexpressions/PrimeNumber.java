package lambdaexpressions;

import java.util.function.Predicate;

public class PrimeNumber{
//	non static method reference example
	static  boolean isPrime(int n) {
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
//		PrimeNumber pr=new PrimeNumber();
//		Predicate<Integer> p=pr::isPrime;
//		
//		System.out.println(p.test(10));

//		
//		Predicate<Integer> pt=new PrimeNumber()::isPrime;
//		System.out.println(pt.test(23));
		
		
		
		
		
	}
}