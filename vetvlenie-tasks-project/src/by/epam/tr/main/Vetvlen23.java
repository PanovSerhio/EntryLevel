package by.epam.tr.main;

import java.util.Scanner;

public class Vetvlen23 {

	public static void main(String[] args) {
		// определить правильность даты, введенной с клавиатуры(число от 1 до 31 и мес€ц
		// от 1 до 12).
		// ≈сли введены некорректно, то ссобщить об этом

		int date;
		int month;

		Scanner sc = new Scanner(System.in);
		System.out.println("введите дату: ");
		date = sc.nextInt();
		System.out.println("введите мес€ц: ");
		month = sc.nextInt();

		if (date <= 0 || date >= 32 && month <= 0 || month >= 13) {
			System.out.println("ошибочно введены данные");

		} else {
			System.out.println("число " + date + "-е, мес€ц " + month + "-й");
		}

	}
}
