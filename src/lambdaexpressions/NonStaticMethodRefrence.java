package lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class NonStaticMethodRefrence {
	
	
	
public static void main(String[] args) {
	
//	----------------------non static method reference after anonymous inner class
//	we call using reference variable of the class 
	NonStaticMethodRefrence n=new NonStaticMethodRefrence();
	
//	n.new PrimeNumber().isPrime(10);
	
	
	
	
	
	List<String> names=Arrays.asList("sureesh","ramesh","rakesh","griesh","shahbaz","kees");
	
//	Consumer<String> name=System.out::println;
//	names.forEach(name);
	
//	Consumer<String> c3=(na)->{
//		if(na.indexOf('e')>=0) {
//			System.out.println(na);
//		}
//	};
//	
//	names.forEach(c3);
//----------------------------------------------------------
	
    names.forEach(System.out::println);
    names.forEach((t)->System.out.println("hello "+ t));
    
//    non static method refrence
}
}
