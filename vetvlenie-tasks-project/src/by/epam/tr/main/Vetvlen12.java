package by.epam.tr.main;

public class Vetvlen12 {

	public static void main(String[] args) {
		// даны 3 действит. числа, возвести в квадрат Ќ≈ќ“–»÷ј“., в четвертую
		// степень-отрицательные

		int a = 5;
		int b = 4;
		int c = -5;

		if (a < 0) {
			System.out.println(Math.pow(a, 4));
		} else
			System.out.println(a * a);

		if (b < 0) {
			System.out.println(Math.pow(b, 4));
		} else
			System.out.println(b * b);

		if (c < 0) {
			System.out.println(Math.pow(c, 4));
		} else
			System.out.println(c * c);
	}

}
