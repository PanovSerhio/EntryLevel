package by.epam.tr.main;

public class Cycle05 {

	public static void main(String[] args) {
		// � ������� while �������� ����� ����������� ����� ����
		// �������� ����� � ��������� �� 1 �� 99 ������������.

		int x = 1;
		int sum = 0;

		while (x <= 99) {
			sum = sum + x;
			x = x + 2;
		}
		System.out.println("����� �������� ����� = " + sum);

	}

}
