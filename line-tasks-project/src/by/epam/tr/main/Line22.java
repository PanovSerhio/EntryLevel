package by.epam.tr.main;

public class Line22 {

	public static void main(String[] args) {
		// ���� ����������� ����� �, ������� ������������ ������������ ����������
		// ������� � ��������.
		// ������� ������ �������� ������������ � �����, ������� � �������� � ���������
		// �����: ��� ����� SSc.

		int T = 10800;
		int hours = (T / 3600);
		int temp = T - (hours * 3600);
		int minutes = temp / 60;
		int seconds = temp - (minutes * 60);

		System.out.println("�������� ������������ � ��������: " + T);

		if ((hours>=0)&&(hours<= 9)&&(minutes>=0)&&(minutes<=9)&&(seconds>=0)&&(seconds<=9)) {
			System.out.println("0" + hours + " �. 0" + minutes + " ���. 0" + seconds + " c.");
			
		} else {
			System.out.println(hours + " �. " + minutes + " ���. " + seconds + " c.");
			
		}
	}
}
