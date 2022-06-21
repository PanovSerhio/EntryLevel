package by.epam.tr.main;

public class Vetvlen26 {

	public static void main(String[] args) {
		// najty summy bolshego i menshego iz 3 chysel.

		double a = 1;
		double b = 5;
		double c = 15;
		double max;
		double min;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		
		double sum = min + max;
		System.out.println("Сумма минимума и максимума = " + sum);
	}

}
