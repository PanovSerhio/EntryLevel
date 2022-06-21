package by.epam.tr.main;

public class Vetvlen15 {

	public static void main(String[] args) {
		// действит.числа x и y - они не равны друг другу.Меньшее из них заменить
		// половиной их суммы. Большее - их удвоенным призведением.

		double x = 7;
		double y = 6;
		double newX = 0;
		double newY = 0;

		if (x < y) {
			newX = (x + y) / 2;
			newY = (x * y) * 2;
			System.out.println("наименьшее значение -x-, половина суммы чисел = " + newX);
			System.out.println("наибольшее значение -y-, удвоенное произведение = " + newY);

		} else if (y < x) {
			newY = (x + y) / 2;
			newX = (x * y) * 2;
			System.out.println("наименьшее значение -y-, половина суммы чисел = " + newY);
			System.out.println("наибольшее значение -x-, удвоенное произведение = " + newX);

		}

	}
}
