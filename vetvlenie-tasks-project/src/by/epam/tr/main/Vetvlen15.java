package by.epam.tr.main;

public class Vetvlen15 {

	public static void main(String[] args) {
		// ��������.����� x � y - ��� �� ����� ���� �����.������� �� ��� ��������
		// ��������� �� �����. ������� - �� ��������� ������������.

		double x = 7;
		double y = 6;
		double newX = 0;
		double newY = 0;

		if (x < y) {
			newX = (x + y) / 2;
			newY = (x * y) * 2;
			System.out.println("���������� �������� -x-, �������� ����� ����� = " + newX);
			System.out.println("���������� �������� -y-, ��������� ������������ = " + newY);

		} else if (y < x) {
			newY = (x + y) / 2;
			newX = (x * y) * 2;
			System.out.println("���������� �������� -y-, �������� ����� ����� = " + newY);
			System.out.println("���������� �������� -x-, ��������� ������������ = " + newX);

		}

	}
}
