package lambdaexpressions.assignment;

@FunctionalInterface
interface MathOperation {
	double calculate(double a, double b);
}

public class _5MathOperation {
	public static void main(String[] args) {

		MathOperation modulus = (a, b) -> a % b;

		MathOperation power = (a, b) -> Math.pow(a, b);

		double num1 = 10;
		double num2 = 10;

		System.out.println("Modulus of " + num1 + " and " + num2 + " is: " + modulus.calculate(num1, num2));
		System.out.println("Power of " + num1 + " raised to " + num2 + " is: " + power.calculate(num1, num2));
	}
}
