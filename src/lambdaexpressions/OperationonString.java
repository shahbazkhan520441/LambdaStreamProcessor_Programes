package lambdaexpressions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OperationonString {

	public static void main(String[] args) {

		//		lexlogicaly(in alphabetical order) lesser then n
		String str[]= {"apple","apple", "Banana","Banana", "grape", "Orange","Orange", "lemon","orange"};


		List<String> collect = Arrays.stream(str).filter(s-> s.compareToIgnoreCase("n")<0 ).distinct()
				.sorted(String.CASE_INSENSITIVE_ORDER)
				.collect(Collectors.toList());
		System.out.println(collect);

		/*
		 * "apple" (starts with 'a') is less than 'n'. "Banana" (starts with 'B') is
		 * less than 'n' (case-insensitive). "grape" (starts with 'g') is less than 'n'.
		 * "lemon" (starts with 'l') is also less than 'n'.
		 */



		//		lexlogicaly(in alphabetical order) greater then n
		List<String> collect2 = Arrays.stream(str).filter(s-> s.compareToIgnoreCase("n")>0).distinct()
				.sorted(String.CASE_INSENSITIVE_ORDER)
				.collect(Collectors.toList());
		System.out.println(collect2);

		//		count the number of  occurrence of each word in array 
		Map<String,Long> map= Arrays.stream(str).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);

		//     remove the duplicate words from an array 
		List<String> list = Arrays.stream(str).sorted(String.CASE_INSENSITIVE_ORDER).distinct().toList();
		System.out.println(list);

		//		count the number of occurence of each charter in string array of words

		Map<Character, Long> mapletters=Arrays.stream(str).flatMapToInt(String::chars)
				.mapToObj(c-> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(mapletters);

		//     Count the occurrences of each character (case-insensitive)
		Map<Character, Long> charCount = Arrays.stream(str)
				.flatMapToInt(String::chars) // Convert each string to a stream of characters
				.mapToObj(c -> (char) c) // Convert int stream to character stream
				.map(Character::toLowerCase) // Convert characters to lowercase
				.collect(Collectors.groupingBy(
						Function.identity(), // Group by character
						Collectors.counting() // Count occurrences
						));
		System.out.println(charCount);

		Map<String, Long> mapOfEachWord = Arrays.stream(str)
				.collect(Collectors.groupingBy(
						Function.identity(), // Group by the word itself
						Collectors.counting() // Count occurrences
						));

		// Sort the map by key (word) in alphabetical order
		Map<String, Long> sortedMap = mapOfEachWord.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER)) // Sort by key alphabetically
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(e1, e2) -> e1,
						LinkedHashMap::new // Use LinkedHashMap to preserve the order
						));

		System.out.println(sortedMap);

		//       sorting based on alphabatic order because treemap fllows natural sorting order and counting the number of occurences of each elemet  
		Map<String, Long> sortedMap1 = Arrays.stream(str)
				.collect(Collectors.groupingBy(
						String::toLowerCase, // Group by word, case-insensitive
						TreeMap::new, // Use TreeMap to automatically sort alphabetically
						Collectors.counting() // Count occurrences
						));
		System.out.println(sortedMap1);
		
		
		











	}

}
