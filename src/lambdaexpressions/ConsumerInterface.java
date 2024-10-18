package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerInterface {

	public static void main(String[] args) {
//1		Anonymous inner class to provide implementation to function interface 
		Consumer<String> c=new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		c.accept("shahbaz");
		
//2		static method refrence 
//		shorthand notaion for java
		Consumer<String> c1=System.out::println;
		c1.accept("khan");
		
//3		static method refrence 
//		shorthand notaion for java
		Function<String, Integer> f=Integer::parseInt;
		Integer apply = f.apply("123");
		System.out.println(apply);
		
//		----------------------non static method reference after anonymous inner class
		
		List<String> names=Arrays.asList("sureesh","ramesh","rakesh","griesh","shahbaz","kees");
		
//		Consumer<String> name=System.out::println;
//		names.forEach(name);
		
//		Consumer<String> c3=(na)->{
//			if(na.indexOf('e')>=0) {
//				System.out.println(na);
//			}
//		};
//		
//		names.forEach(c3);
//	----------------------------------------------------------
		
        names.forEach(System.out::println);
        names.forEach((t)->System.out.println("hello "+ t));
        
        
        
		
		
		
		
	}
}
