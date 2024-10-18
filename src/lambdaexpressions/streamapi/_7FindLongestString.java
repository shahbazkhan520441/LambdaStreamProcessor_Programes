package lambdaexpressions.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class _7FindLongestString {
	
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("shahbaz","khan","aftab");
		
		Optional<String> max = asList.stream().max(Comparator.comparingInt(String::length));
		
		max.ifPresentOrElse(
				str->System.out.println("longest string "+  str),
				()->System.out.println("this list is empty")
				
				
				);
		
	    // Find the longest string using reduce
        String longestString = asList.stream()
                                      .reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2)
                                      .orElse("The list is empty.");
	}

}
