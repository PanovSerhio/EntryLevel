package by.epam.tr.main;

public class Line10 {

	public static void main(String[] args) {

		double x = -2.1;
		double y = 3.5;

		double result1 = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y));
		double result2 = (result1 * Math.tan(x * y));

		System.out.println("значение выражения = " + result2);

	}
}