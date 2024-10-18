package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stringwithlambda {
	public static void main(String[] args) {

		String str[]= {"ramesh","suresh","rakesh","rajesh"};

		List<String> names= Arrays.stream(str).map(String::toUpperCase).toList();
		names.forEach(n->System.out.println("-> "+n));

		System.out.println(names);

		int n=1234;



		long count = IntStream.of(n).count();   
		System.out.println(count);// 1 

		int length = String.valueOf(n).length();
		System.out.println(length);//4

		int sum=String.valueOf(n).chars().map((x)-> x-48).sum();
		System.out.println(sum);





	}
}
