package by.epam.tr.main;

public class Vetvlen24 {

	public static void main(String[] args) {
		// составить прогу, определяющую результат гадания на ромашке-"любит-не любит", n кол-во лепестков.

		int x = 1;
		int y = 2;
		int n = 16;// количество лепестков

		while (y <= n) {
			System.out.println(x + " - любит");
			x = x + 2;
			System.out.println(y + " - не любит");
			y = y + 2;
		}

	}

}
