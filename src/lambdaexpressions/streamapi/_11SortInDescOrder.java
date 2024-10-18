package lambdaexpressions.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _11SortInDescOrder {
	
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,23,34,1,2,3,4,56,78,10,11,50);
		
		numbers.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		
		numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
      Collections.sort(numbers,(a,b)->b-a);	
      
      List<Integer> sortedNumbers = numbers.stream()
              .sorted(Comparator.comparingInt(Integer::intValue).reversed())
              .collect(Collectors.toList());
      
	}

}
