package by.epam.tr.main;

public class Vetvlen16 {

	public static void main(String[] args) {
		// �� ��������� X0Y ���� ����� �. �������, ��� ��� �����������(����� ��� � �����
		// ������������ ����?).

		double x = 0;
		double y = 0;

		if (x > 0 && y > 0) {
			System.out.println("����� � ��������� � 1 ������������ ����");

		} else if (x < 0 && y > 0) {
			System.out.println("����� � ��������� �� 2 ������������ ����");

		} else if (x < 0 && y < 0) {
			System.out.println("����� � ��������� � 3 ������������ ����");

		} else if (x > 0 && y < 0) {
			System.out.println("����� � ��������� � 4 ������������ ����");

		} else if (x == 0 && y != 0) {
			System.out.println("����� � ��������� �� ��� Y");

		} else if (x != 0 && y == 0) {
			System.out.println("����� � ��������� �� ��� X");

		} else if (x == 0 && y == 0) {
			System.out.println("����� � ��������� � ������� ���� ���������");

		}

	}
}
