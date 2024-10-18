package lambdaexpressions;

import java.util.function.Consumer;
import java.util.function.Function;

public class StaticMethodRefrence {
public static void main(String[] args) {
	//1		Anonymous inner class to provide implementation to function interface 
//	we call directly using class name 
			Consumer<String> c=new Consumer<String>() {
				
				@Override
				public void accept(String t) {
					System.out.println(t);
				}
			};
			c.accept("shahbaz");
			
//			shorthand notaion for java
			Consumer<String> c1=System.out::println;
			c1.accept("khan");
			
	//3		static method refrence 
//			shorthand notaion for java
			Function<String, Integer> f=Integer::parseInt;
			Integer apply = f.apply("123");
			System.out.println(apply);
			
}
}
