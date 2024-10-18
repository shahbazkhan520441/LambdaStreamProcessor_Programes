package lambdaexpressions.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _14ConcatenatetheListOfStringWithComma {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Jerry", "Alice", "Bob");
       
		String collect = names.stream().collect(Collectors.joining(","));
		
		String [] conactenated=new String[] {collect};
		System.out.println(collect);
	}

}
