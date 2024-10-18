package lambdaexpressions;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpressions {
	
public static void main(String[] args) {

	// Lambda expression that implements a Runnable
	Runnable r = () -> System.out.println("Running in a thread");
    Thread t =new Thread(r);
    t.start();
    
    Predicate<String> isNotEmpty = s -> !s.isEmpty();
    
	Consumer<String> c=(x)->{
		
		for(int i=0;i<10;i++) {
			System.out.println(i+" ");
			
		}
	};
	c.accept("s");
	
	
	
}
}
