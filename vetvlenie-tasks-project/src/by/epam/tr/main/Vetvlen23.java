package by.epam.tr.main;

import java.util.Scanner;

public class Vetvlen23 {

	public static void main(String[] args) {
		// ���������� ������������ ����, ��������� � ����������(����� �� 1 �� 31 � �����
		// �� 1 �� 12).
		// ���� ������� �����������, �� �������� �� ����

		int date;
		int month;

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����: ");
		date = sc.nextInt();
		System.out.println("������� �����: ");
		month = sc.nextInt();

		if (date <= 0 || date >= 32 && month <= 0 || month >= 13) {
			System.out.println("�������� ������� ������");

		} else {
			System.out.println("����� " + date + "-�, ����� " + month + "-�");
		}

	}
}
