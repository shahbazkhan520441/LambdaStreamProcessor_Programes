package lambdaexpressions.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _15MapListOfIntegrWithThereSquares {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 4);
		
		Map<Integer, Integer> collect = numbers.stream().collect(Collectors.toMap(n->n,n->n*n));
		
		System.out.println(collect);
	}

}
