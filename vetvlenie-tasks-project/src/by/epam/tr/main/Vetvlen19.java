package by.epam.tr.main;

public class Vetvlen19 {

	public static void main(String[] args) {
		// посчитать количество положительных чисел среди а,б,с

		double a = 1;
		double b = -2;
		double c = 2;
		double count = 0;

		if (a > 0) {
			count++;
		}
		if (b > 0) {
			count++;
		}
		if (c > 0) {
			count++;
		}
		System.out.println(" оличество положительных чисел: " + count + " шт.");

	}

}
