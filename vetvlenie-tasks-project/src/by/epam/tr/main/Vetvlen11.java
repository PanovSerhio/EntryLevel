package by.epam.tr.main;
public class Vetvlen11 {

	public static void main(String[] args) {
		// ������� ������ ������������ ������

		double a1 = 7.0;
		double b1 = 6.0;
		double c1 = 6.0;// ������� ������������ �1

		double a2 = 6.0;
		double b2 = 6.0;
		double c2 = 6.0;// ������� ������������ �2

		double P1 = (a1 + b1 + c1) / 2;
		double P2 = (a2 + b2 + c2) / 2;
		double S1 = Math.sqrt(P1 * (P1 - a1) * (P1 - b1) * (P1 - c1));// ������� �1
		double S2 = Math.sqrt(P2 * (P2 - a2) * (P2 - b2) * (P2 - c2));// ������� �2

		if (S1 > S2) {
			System.out.println("������� ������������ �1 ������");

		} else if (S2 == S1) {
			System.out.println("������� ����� ������������� �����");

		} else
			System.out.println("������� ����������� �2 ������");
	}
		
}
