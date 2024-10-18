package lambdaexpressions.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _8NamesStratsWithJ {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Jerry", "Alice", "Bob");
		
		long count = names.stream().filter(name-> name.startsWith("J")).count();
		System.out.println(count);
		List<String> namesstartwithj = names.stream().filter(name-> name.startsWith("J")).collect(Collectors.toList());
		namesstartwithj.forEach(System.out::println);
		
	 names.stream().filter(name-> name.startsWith("J")).forEach(System.out::println);
	}
	
	
	

}
