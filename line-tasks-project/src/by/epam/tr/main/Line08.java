package by.epam.tr.main;

public class Line08 {

	public static void main(String[] args) {
		// ��������� �������� ���������: b +������ ���������� �� b2+4ac/2a - f3c+b(� ����� ������ �������)
		
		double a = 5;
		double b = 6;
		double c = 8;
		double action1 = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a);//����� ����� ���������
		double action2 = Math.pow(a, 3) * c + Math.pow(b, -2);//������ ����� ���������
		double result = action1 - action2;//��������� ������ ����� �� �����
		
		 System.out.println("�������� ��������� = " + result);
		

	}

}
