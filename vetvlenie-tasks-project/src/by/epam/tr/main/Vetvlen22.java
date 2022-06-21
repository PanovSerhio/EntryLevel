package by.epam.tr.main;

public class Vetvlen22 {

	public static void main(String[] args) {
		//перерспределить значения переменных, чтобы у X оказалось большее из значений, а у Y меньшее
		int x = 7;
		int y = 9;
		int z = 0;

		if (x > y) {

			System.out.println("наибольшее значение присовено X и оно равно: " + x);
			System.out.println("наименьшее значение присвоено Y и оно равно: " + y);
		}
		if (x < y) {
			z = y;
			y = x;
			x = z;
		}
		System.out.println("наибольшее значение присовено X и оно равно: " + x);
		System.out.println("наименьшее значение присвоено Y и оно равно: " + y);
	}

}
