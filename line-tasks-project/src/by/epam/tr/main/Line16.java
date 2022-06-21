package by.epam.tr.main;

public class Line16 {

	public static void main(String[] args) {
		// Найти произведение цифр заданного четырехзначного числа.

		int x = 2345;

		int a = x / 1000;
		int b = x % 1000 / 100;
		int c = x % 100 / 10;
		int d = x % 10;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		System.out.println("произведение цифр этого числа = " + a * b * c * d);

	}

}
