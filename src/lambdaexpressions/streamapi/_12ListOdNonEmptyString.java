package lambdaexpressions.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _12ListOdNonEmptyString {
	
	public static void main(String[] args) {
		  List<String> fruits = Arrays.asList("apple", "", "banana", "orange", "", "grape");
		  
		  
		  fruits.stream().filter(s-> !s.isEmpty()).collect(Collectors.toList());
		  
	}

}
