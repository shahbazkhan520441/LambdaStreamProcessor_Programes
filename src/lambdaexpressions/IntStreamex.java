package lambdaexpressions;

import java.util.stream.IntStream;

public class IntStreamex {
	
	 public   void	isPrime(int n) {
		   for(int i=2;i<n/2;i++) {
			   if(n%i==0) {
				   System.out.println(n+"  is not a prime ");
			   }
		   }
		   System.out.println(n+ " is prime number");
	   
	}
	 
	 static boolean isPrime2(int n) {
		 return IntStream.rangeClosed(2, n/2).noneMatch(i->n%i==0);
	 }
	 
	 static boolean isPerfecrt(int n) {
		 int result= IntStream.rangeClosed(1, n/2).reduce(0,(sm,b)->n%b==0?sm+b:sm);
		 
		 return result==n;
		 
	 }

	
	public static void main(String[] args) {
		int ar[]= {10,20,45,1,34,22,44,};
//		sort in assending order
//		IntStream.of(ar).sorted().forEach(System.out::println);
		
//	 print if it is > 20	
//		IntStream.of(ar).filter((x)-> x>20).forEach(System.out::println);
		
//sum of even number 
//		int sum = IntStream.of(ar).filter((e)-> e%2==0).sum();
//		System.out.println(sum);
		
//		sum of even number s another way
		
//		int evensum=Arrays.stream(ar).filter((e)-> e%2==0).sum();
//		System.out.println(evensum);
		
		
		boolean result=isPrime2(31);
		System.out.println(result);
		
	
	


}
}