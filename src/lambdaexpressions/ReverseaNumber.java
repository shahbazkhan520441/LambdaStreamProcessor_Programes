package lambdaexpressions;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseaNumber {
public static void main(String[] args) {
	Comparator<Integer> com=Comparator.reverseOrder();
	TreeSet<Integer> ts=new TreeSet<>(Comparator.reverseOrder());
	ts.add(23);
	ts.add(285);
	ts.add(36);
	ts.add(25);
	
	System.out.println(ts);
}
}
