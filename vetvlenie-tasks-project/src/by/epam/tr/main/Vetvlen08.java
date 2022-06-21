package by.epam.tr.main;
public class Vetvlen08 {

	public static void main(String[] args) {
		// найти наименьший из квадратов двух чисел
		double a = 3;
		double b = 2;
		double a2 = (a * a);
		double b2 = (b * b);

		System.out.println("квадрат числа а = " + a2);
		System.out.println("квадрат числа b = " + b2);

		if (a2 < b2)
			System.out.println("наименьший из квадратов у числа: а");

		else {
			System.out.println("наименьший из квадратов у числа: b");
		}

	}

}
