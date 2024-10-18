package lambdaexpressions.assignment;

@FunctionalInterface
interface IntOperation {
	int apply(int x, int y);
}

public class _1Intoperationusinglambda {
	public static void main(String[] args) {

		IntOperation addition = (x, y) -> x + y;

		IntOperation subtraction = (x, y) -> x - y;

		IntOperation multiplication = (x, y) -> x * y;

		IntOperation division = (x, y) -> {
			if (y == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			return x / y;
		};

		int a = 10;
		int b = 5;

		System.out.println("Addition of " + a + " and " + b + ": " + addition.apply(a, b));
		System.out.println("Subtraction of " + a + " and " + b + ": " + subtraction.apply(a, b));
		System.out.println("Multiplication of " + a + " and " + b + ": " + multiplication.apply(a, b));
		System.out.println("Division of " + a + " and " + b + ": " + division.apply(a, b));
	}
}
