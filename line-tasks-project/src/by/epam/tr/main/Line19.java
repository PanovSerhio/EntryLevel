package by.epam.tr.main;

public class Line19 {

	public static void main(String[] args) {
		// ���� ������� ��������������� ������������. ����� ������� ����� ������������, 
		//��� ������, ������� ��������� � ��������� �����������
		
		double a = 1.5;

        double s = (a * a * Math.sqrt(3)) / 4;
        double h = a * Math.sqrt(3) / 2;
        double radIn = a * Math.sqrt(3) / 6;
        double radOut = a * Math.sqrt(3) / 3;

        System.out.println("������� ������������ = " + s);
        System.out.println("������ ������������ =  " + h);
        System.out.println("������ ��������� ���������� = " + radIn);
        System.out.println("������ ��������� ���������� = " + radOut);
        System.out.println();

	}

}
