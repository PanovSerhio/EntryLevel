package by.epam.tr.main;

public class Line14 {

	public static void main(String[] args) {
		// ¬ычислить длину окружности и площадь круга одного и того же заданного радиуса
		// R.

		double r = 6.8;

		double length = 2 * Math.PI * r;
		double s = Math.PI * r * r;

		System.out.print(" радиус круга R = " + r + "\n длина окружности = " + length + "\n площадь круга = " + s);
		System.out.println();
	}

}
