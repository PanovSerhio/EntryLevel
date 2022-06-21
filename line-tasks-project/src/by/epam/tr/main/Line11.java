package by.epam.tr.main;

public class Line11 {

	public static void main(String[] args) {
		//вычислить периметр и площад прямоугольного реугольника 
		//по длинам a и b двух катетов
		
		double a = 5.0;
		double b = 7.0;
		double c = Math.sqrt(a * a + b * b);//Гипотенуза
		
		double s = a * b / 2;
		double p = a + b + c;
		
		System.out.println("площадь прямоугольного треугольника = " + s);
		System.out.println("периметр прямоугольного треугольника = " + p);

	}

}
