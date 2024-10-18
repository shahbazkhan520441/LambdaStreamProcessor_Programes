package lambdaexpressions.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _6SumAAllEvenNUMbers {

	public static void main(String[] args) {

		List<Integer> numlist=Arrays.asList(10,202,30,40,40,30,40,56,70,59);

		int sum=numlist.stream().filter(n -> n%2==0)
				.mapToInt(Integer::intValue)
				.sum();

		int sumOfEvenNumbers = numlist.stream()
				.filter(n -> n % 2 == 0)   // Filter even numbers
				.reduce(0, Integer::sum); 
		
		 int sumOfEvenNumber = (int) numlist.stream()
                 .filter(n -> n % 2 == 0)    // Filter even numbers
                 .collect(Collectors.summarizingInt(Integer::intValue)) // Collect statistics
                 .getSum(); 
		 System.out.println(sum);
		 System.out.println(sumOfEvenNumbers);
		 System.out.println(sumOfEvenNumber);
	}

}
