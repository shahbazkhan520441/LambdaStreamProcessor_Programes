package lambdaexpressions.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class _9AverageOfDouleValues {
	
	public static void main(String[] args) {
		
		List<Double> values = Arrays.asList(10.5, 20.75, 30.0, 40.25, 50.5);
		
		OptionalDouble average = values.stream().mapToDouble(Double::doubleValue).average();
		 if (average.isPresent()) {
	            System.out.println("Average: " + average.getAsDouble());
	        } else {
	            System.out.println("The list is empty.");
	        }
		 
		 // Custom collector to find the average
	        double average2 = values.stream()
	                               .collect(Collectors.averagingDouble(Double::doubleValue));
	        
	        OptionalDouble average3 = DoubleStream.of(10.5, 20.75, 30.0, 40.25, 50.5)
                    .average();
		
	}

}
