package by.epam.tr.main;

public class Vetvlen21 {

	public static void main(String[] args) {
		// ������� �� ����� ������:"��� ��, ������� ��� �������? ����� � ��� �." ���� �
		// - ��������� "��� �������� �������"
		// ���� � - ��������� "��� �������� ��������"

		char answer = '�';
		System.out.println("��� ��: ������� ��� �������? ����� � ��� �");
		System.out.println(answer);

		switch (answer) {
		case '�':
			System.out.println("��� �������� �������!");
			break;
		case '�':
			System.out.println("��� �������� ��������!");
			break;
		default:
			System.out.println("�������� ��������!");
		}
		System.out.println();
	}

}
