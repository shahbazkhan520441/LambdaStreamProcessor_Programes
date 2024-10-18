package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob","azher", "Charlie", "David");
        
        // Filtering and mapping using streams
        List<String> filteredNames = names.stream()
            .filter(name -> name.toUpperCase().startsWith("A"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        for (String string : filteredNames) {
        	
			System.out.println(string);
		}
//        System.out.println(filteredNames); // Output: [ALICE]
    }
}
