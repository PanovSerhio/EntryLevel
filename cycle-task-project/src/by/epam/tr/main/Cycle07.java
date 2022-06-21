package by.epam.tr.main;

public class Cycle07 {

	public static void main(String[] args) {
		// вычислить значение функции на отрезке[a,b]с шагом h:

		int a = 1;
		int b = 2;
		int h = 2;
		int y;

		for (int i = a; i <= b; i = i + h) {
			if (i > 2) {
				y = i;
			} else {
				y = i * (-1);
			}
			System.out.println("При a = " + i + " y = " + y);
		}

	}

}
