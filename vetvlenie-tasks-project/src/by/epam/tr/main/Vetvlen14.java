package by.epam.tr.main;

public class Vetvlen14 {

	public static void main(String[] args) {
		// Дано 2 угла треугольника. определить, треугольник это и будет ли он
		// прямоугольным.

		double corner1 = 30;
		double corner2 = 60;
		double corner3 = 180 - corner1 - corner2;

		if (corner1 > 0 && corner2 > 0 && corner3 > 0) {
			System.out.println("Треугольник существует");

			if (corner1 == 90 || corner2 == 90 || corner3 == 90) {
				System.out.println("и этот треугольник прямоугольный");
			}
		} else {
			System.out.println("Не получается треугольная фигура");
		}
	}
}
