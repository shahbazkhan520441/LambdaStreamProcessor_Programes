package lambdaexpressions.streamapi.optional;

import java.util.Optional;

public class _16ReturnOptionalString {
	


	    /**
	     * Wraps a string in an Optional.
	     * 
	     * @param value the string to wrap
	     * @return an Optional containing the string if it is not null, otherwise Optional.empty()
	     */
	    public static Optional<String> wrapString(String value) {
	        return Optional.ofNullable(value);
	    }
	    
	    public static void printString(Optional<String> st) {
	    	if(st.isPresent()) {
	    		System.out.println(st);
	    	}
	    }
	    

	    public static void main(String[] args) {
	        // Test the method with different values
	        String nonNullString = "Hello, World!";
	        String nullString = null;

	        // Wrap non-null string
	        Optional<String> optionalNonNull = wrapString(nonNullString);
	        System.out.println("Optional with non-null string: " + optionalNonNull);
             
	        // Wrap null string
	        Optional<String> optionalNull = wrapString(nullString);
	        System.out.println("Optional with null string: " + optionalNull);
	    
	}


}
