package by.epam.tr.main;

public class Line13 {

	public static void main(String[] args) {
		// ������ ���������� ���� ������ ������������ (�1, �2),(�2, �2),(�3, �3). 
		//����� ��� �������� � �������.
		
		double x1 = 2.0;
        double x2 = 4.0;
        double x3 = 6.0;
        double y1 = 1.0;
        double y2 = 3.0;
        double y3 = 7.0;
        
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); //����� ������
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        
        double P = (a + b + c) / 2;
        double S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        
        System.out.println("�������� ������������ = " + P);
        System.out.println("������� ������������ = " + S);

	}

}
