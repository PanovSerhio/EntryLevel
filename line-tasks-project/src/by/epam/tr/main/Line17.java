package by.epam.tr.main;

public class Line17 {

	public static void main(String[] args) {
		// ���� ��� �����. ����� ������� �������������� ����� ���� ����� � 
		//������� �������������� ������� ���� �����.
		
		double x = 2.2;
		double y = 3.3;
		
		double midMath = (Math.pow(x, 3) + Math.pow(y, 3)) / 2;
		double midGeom = Math.sqrt(Math.abs(x) * Math.abs(y));
		
		System.out.println("������� �������������� ����� = " + midMath);
		System.out.println("������� �������������� ������� = " + midGeom);

	}

}
