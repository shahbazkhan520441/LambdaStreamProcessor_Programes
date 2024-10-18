package lambdaexpressions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofEachElement {
	//	converts array to stream 
	public static void main(String[] args) {

		Integer   []ar= {10,20,2,4,5,18,16,40,11,1,1,2,2,3,3,3};

		Map<Integer, Long> freqofeaachelement=
				Arrays.stream(ar).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(freqofeaachelement);
	}

}
