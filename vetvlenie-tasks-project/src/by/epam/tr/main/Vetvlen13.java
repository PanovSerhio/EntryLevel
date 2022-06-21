package by.epam.tr.main;

public class Vetvlen13 {

	public static void main(String[] args) {
		// какая из точек ближе к началу координат?

		double x1 = 4;
		double y1 = 4;
		double x2 = 4;
		double y2 = 4;
		double lenght1 = Math.sqrt(x1 * x1 + y1 * y1);
		double lenght2 = Math.sqrt(x2 * x2 + y2 * y2);

		if (lenght1 < lenght2) {
			System.out.println("точка (x1,y1) ближе к началу координат");

		} else if (lenght1 == lenght2) {
			System.out.println("точки на одинаковом расстоянии от начала координат");

		} else {
			System.out.println("точка (x2,y2) ближе к началу координат");

		}

	}
}
