package lambdaexpressions.assignment;

import java.util.Arrays;
import java.util.function.Predicate;


import java.util.function.Predicate;

public class _3CheckStringContainSubStrOrNot {

    public static boolean containsAllChars(String mainStr, String subStr) {
        mainStr = mainStr.toLowerCase();
        subStr = subStr.toLowerCase();

        for (char c : subStr.toCharArray()) {
            if (mainStr.indexOf(c) == -1) {
                return false; // Character not found in the main string
            }
            mainStr = mainStr.replaceFirst(Character.toString(c), ""); // Remove the found character to avoid duplication issues
        }
        return true;
    }

    public static void main(String[] args) {
        Predicate<String> str = (s) -> containsAllChars(s, "khan");

        System.out.println(str.test("shahbaz khan"));        // true
        System.out.println(str.test("SHAHBAZ AKNH"));        // true (ignores case and sequence)
        System.out.println(str.test("shahbaz ankh"));        // true (ignores sequence)
        System.out.println(str.test("shahbaz"));             // false (does not contain all characters)
    }
}

	
//	Predicate<String> str11=(s)->s.contains("khan");
//	
//	System.out.println(str11.test("shahbaz khan"));
	
	


