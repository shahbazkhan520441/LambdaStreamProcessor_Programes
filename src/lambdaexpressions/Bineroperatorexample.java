package lambdaexpressions;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Bineroperatorexample {
//	accept to arrgument of type t and perform oeration and return the result of thype t
	
	
	public static void main(String[] args) {
		int[] ar= {10,20,20};
		BinaryOperator<Integer> addvalue=(a,b)->a+b;
		BinaryOperator<Integer> addvalue2=(a,b)->a-b;
		for(int i=0;i<20;i++) {
			Integer apply = addvalue.apply(i, i+1);
			System.out.println(apply);
		}
		int result=addvalue.apply(10, 10);
		int result2=addvalue2.apply(10, 10);
		System.out.println(result);
		System.out.println(result2);
		Consumer<Integer> c=(t)->{
//			addvalue.apply(10,20 );
			for(int i=0;i<=10;i++) {
			System.out.println(t);
			}
		};
		System.out.println("end");
//		System.out.println(addvalue);
	}

}
