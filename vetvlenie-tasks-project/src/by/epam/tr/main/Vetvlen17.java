package by.epam.tr.main;

public class Vetvlen17 {

	public static void main(String[] args) {
		// ���� ����� ����� m,n. ���� ��� �����, �� �������� ������ �� �������� � ��� ��
		// ������, ������ �������� �� ��������, � ���� �����, �������� ������

		double m = 3;
		double n = 3;

		if (m != n) {
			if (m > n) {
				n = m;

			} else {
				m = n;
			}
		} else {
			m = 0;
			n = 0;
		}
		System.out.println("����� m = " + m + " � ����� n = " + n);
	}

}
