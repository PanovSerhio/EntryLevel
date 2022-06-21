package by.epam.tr.main;

public class Line08 {

	public static void main(String[] args) {
		// вычислить значение выражения: b +корень квадратный из b2+4ac/2a - f3c+b(в минус второй степени)
		
		double a = 5;
		double b = 6;
		double c = 8;
		double action1 = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a);//левая часть выражения
		double action2 = Math.pow(a, 3) * c + Math.pow(b, -2);//правая часть выражения
		double result = action1 - action2;//вычитание правой части из левой
		
		 System.out.println("значение выражения = " + result);
		

	}

}
