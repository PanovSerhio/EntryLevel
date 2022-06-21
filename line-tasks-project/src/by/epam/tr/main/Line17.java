package by.epam.tr.main;

public class Line17 {

	public static void main(String[] args) {
		// Даны два числа. Найти среднее арифметическое кубов этих чисел и 
		//среднее геометрическое модулей этих чисел.
		
		double x = 2.2;
		double y = 3.3;
		
		double midMath = (Math.pow(x, 3) + Math.pow(y, 3)) / 2;
		double midGeom = Math.sqrt(Math.abs(x) * Math.abs(y));
		
		System.out.println("среднее арифметическое кубов = " + midMath);
		System.out.println("среднее геометрическое модулей = " + midGeom);

	}

}
