package by.epam.tr.main;

public class Line06 {

	public static void main(String[] args) {
		// � "�" ����� ������� 80�. ������. ������� ������ ������ � "�" ������� �������
		//���� � ������ ������� ������ �� 12�. ������?
		
		double n = 10;//���������� n ����� �������
		double nVolume = 80;//����� ������ � ����� �������
		double nLiter = nVolume / n;//���������� ������ � ����� ����� ������
		
		double m = 5;//���-�� ������� �������
		double mLiter = nLiter + 12;//���-�� ������ � ����� ������� ������
		double mVolume = mLiter * m;//����� ���-�� ������ � m ������� �������
		
		System.out.println("� ����� ������� ������ ���������� " + mLiter + " ������ ������");
		System.out.println("� " + m + " ������� ������� " + mVolume + " ������ ������");

	}

}
