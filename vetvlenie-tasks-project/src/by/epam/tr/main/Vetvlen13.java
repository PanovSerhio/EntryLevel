package by.epam.tr.main;

public class Vetvlen13 {

	public static void main(String[] args) {
		// ����� �� ����� ����� � ������ ���������?

		double x1 = 4;
		double y1 = 4;
		double x2 = 4;
		double y2 = 4;
		double lenght1 = Math.sqrt(x1 * x1 + y1 * y1);
		double lenght2 = Math.sqrt(x2 * x2 + y2 * y2);

		if (lenght1 < lenght2) {
			System.out.println("����� (x1,y1) ����� � ������ ���������");

		} else if (lenght1 == lenght2) {
			System.out.println("����� �� ���������� ���������� �� ������ ���������");

		} else {
			System.out.println("����� (x2,y2) ����� � ������ ���������");

		}

	}
}
