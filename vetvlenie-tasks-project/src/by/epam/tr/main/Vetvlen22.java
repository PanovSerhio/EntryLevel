package by.epam.tr.main;

public class Vetvlen22 {

	public static void main(String[] args) {
		//��������������� �������� ����������, ����� � X ��������� ������� �� ��������, � � Y �������
		int x = 7;
		int y = 9;
		int z = 0;

		if (x > y) {

			System.out.println("���������� �������� ��������� X � ��� �����: " + x);
			System.out.println("���������� �������� ��������� Y � ��� �����: " + y);
		}
		if (x < y) {
			z = y;
			y = x;
			x = z;
		}
		System.out.println("���������� �������� ��������� X � ��� �����: " + x);
		System.out.println("���������� �������� ��������� Y � ��� �����: " + y);
	}

}
