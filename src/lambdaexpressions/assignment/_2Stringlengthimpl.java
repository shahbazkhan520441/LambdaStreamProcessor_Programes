package lambdaexpressions.assignment;
 @FunctionalInterface
 interface StringLength{
	int  length(String s);
	
}
public class _2Stringlengthimpl {
	
	
	
	public static void main(String[] args) {
		
//		to ignore spaces and to ignore commas 
		StringLength strlength=(a)-> a.replace(" ", "").replace(",", "").length();
		System.out.println(strlength.length("sh,ahb a z"));
		System.out.println(strlength.length("khan"));
		System.out.println(strlength.length("aftab kahn"));
	}

}
