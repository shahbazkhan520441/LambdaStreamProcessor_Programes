package lambdaexpressions.assignment;

import java.util.Arrays;
import java.util.stream.Collectors;

@FunctionalInterface
interface Transformer {
	String transform(String input);
}

public class _4StringTransformerDemo {
	public static void main(String[] args) {
		Transformer toLowerCase = (input) -> input.toLowerCase();

		Transformer toUpperCase = (input) -> input.toUpperCase();

		Transformer toTitleCase = (input) ->
		Arrays.stream(input.split(" "))
		.map(word -> word.isEmpty() ? word
				: Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
		.collect(Collectors.joining(" "));



		String testString = "hello world, THIS is a TeSt";

		System.out.println("Original: " + testString);
		System.out.println("Lowercase: " + toLowerCase.transform(testString));
		System.out.println("Uppercase: " + toUpperCase.transform(testString));
		System.out.println("Title Case: " + toTitleCase.transform(testString));
	}
}
