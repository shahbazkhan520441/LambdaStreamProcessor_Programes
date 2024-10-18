package lambdaexpressions;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OperationonArray {
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8,9,10};
		
//		max
		int max=IntStream.of(ar).max().getAsInt();
		
//		min
		int min=IntStream.of(ar).min().getAsInt();
		
//		average
		Double avg=IntStream.of(ar).average().getAsDouble();
		
//		sum
		int sum= IntStream.of(ar).sum();
		
//		product  pro will save result
		int product=IntStream.of(ar).reduce(1, (pro,carry)->pro*carry);
		
//		odd sum
		
		int oddsum=IntStream.of(ar).filter(n->n%2!=0).sum();
		
//		even sum
		
		int evensum=IntStream.of(ar).filter(n->n%2==0).sum();
		
//		collect all even into new array
		int [] array=IntStream.of(ar).filter(n->n%2==0)	.toArray();
		
		System.out.println(Arrays.toString(array));
		
//		collect all odd into new array
		int [] oddarray=IntStream.of(ar).filter(n->n%2!=0).toArray();
		System.out.println(Arrays.toString(oddarray));
		
//		print natural numbers from 1 to n-1
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		
//			print natural numbers from 1 to n
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
		
//	  	print even numbers from one ot 100
		System.out.println();
		IntStream.rangeClosed(1, 100).filter((n)-> n%2==0).forEach(System.out::print);
		
//		print prime from 1 to 100
		IntStream.rangeClosed(2, 100).filter(PrimeNumber::isPrime).forEach(System.out::println);
		
//		count the  prime without using isprime
		
		long count =IntStream.range(2, 100).filter(n->IntStream.rangeClosed(2, n/2).noneMatch(i->n%i==0)).count() ;
		
		long count2 =IntStream.rangeClosed(1, 100).filter(n->IntStream.rangeClosed(2, n/2).noneMatch(i->n%i==0)).count();
		System.out.println(count);
		
//		when dealing with multiplication of large value 
		
		System.out.println("-------------------------------------");
		BigInteger reduce = LongStream.rangeClosed(2, 258).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
			System.out.println(reduce);
			
			
		
		
		
	
	}
}
