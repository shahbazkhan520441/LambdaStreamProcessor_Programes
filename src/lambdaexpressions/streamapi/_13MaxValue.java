package lambdaexpressions.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class _13MaxValue {
	
	public static void main(String[] args) {
		
		   List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 4);
		   
		   OptionalInt max = numbers.stream().mapToInt(Integer::valueOf).max();
		   
		   Optional<Integer> max2 = numbers.stream().max(Integer::compareTo);
		   max2.ifPresent(max1 -> System.out.println("Maximum value: " + max2));
		   
	}

}
