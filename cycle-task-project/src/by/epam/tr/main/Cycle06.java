package by.epam.tr.main;

//import java.util.Scanner;

public class Cycle06 {

	public static void main(String[] args) {
		// ��� �������� ������ ������ �������������� �����
		//��������� ��������� ��� ����� �� 1 �� ���������� �����.
				
        int number = 25;
        int i = 1;
        int sum = 0;

        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println("����� ����� �� 1 �� " + number + " ����� " + sum);
        System.out.println();
    }
}
