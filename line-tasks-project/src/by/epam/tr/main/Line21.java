package by.epam.tr.main;

public class Line21 {

	public static void main(String[] args) {
		// ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). " +
    //�������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.
		
		double x = 123.456;
		
		int firstNum = (int) x;
        int secondNum = (int)((x - firstNum) * 1000);
        double result = secondNum + firstNum * 0.001;
        
        System.out.println((int)x);
        System.out.println("�������� ����� " + x);
        System.out.println("���������� ����� " + result);

	}

}
