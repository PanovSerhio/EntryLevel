package by.epam.tr.main;

public class Vetvlen20 {

	public static void main(String[] args) {
		// Определить, делителем каких чисел а, б, с является число К

		int a = 8;
		int b = 7;
		int c = -4;
		int k = 2;

		if (a % k == 0) {
			System.out.println("Число " + k + " является делителем числа a: " + a);
		} else
			System.out.println("Число " + k + " не является делителем числа a: " + a);

		if (b % k == 0) {
			System.out.println("Число " + k + " является делителем числа b: " + b);
		} else
			System.out.println("Число " + k + " не является делителем числа b: " + b);

		if (c % k == 0) {
			System.out.println("Число " + k + " является делителем числа c: " + c);
		} else
			System.out.println("Число " + k + " не является делителем числа c: " + c);

	}

}
