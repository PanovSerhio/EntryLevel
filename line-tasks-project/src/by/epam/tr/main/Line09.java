package by.epam.tr.main;

public class Line09 {

	public static void main(String[] args) {
		// вычислить значение выражения: (a/c)*(b/d)-((a*b-c)/(c*d))

		double a = 1.0;
		double b = 2.0;
		double c = 3.0;
		double d = 4.0;
		double left = a / c;
		double mid = b / d;
		double right = ((a * b) - c) / (c * d);
		
		double result = (left * mid) - right;

		System.out.println(result);

	}

}
