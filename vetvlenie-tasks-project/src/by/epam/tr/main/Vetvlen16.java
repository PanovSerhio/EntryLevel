package by.epam.tr.main;

public class Vetvlen16 {

	public static void main(String[] args) {
		// На плоскости X0Y есть точка А. Указать, где она расположена(какая ось и какой
		// координатный угол?).

		double x = 0;
		double y = 0;

		if (x > 0 && y > 0) {
			System.out.println("точка А находится в 1 координатном углу");

		} else if (x < 0 && y > 0) {
			System.out.println("точка А находится во 2 координатном углу");

		} else if (x < 0 && y < 0) {
			System.out.println("точка А находится в 3 координатном углу");

		} else if (x > 0 && y < 0) {
			System.out.println("точка А находится в 4 координатном углу");

		} else if (x == 0 && y != 0) {
			System.out.println("точка А находится на оси Y");

		} else if (x != 0 && y == 0) {
			System.out.println("точка А находится на оси X");

		} else if (x == 0 && y == 0) {
			System.out.println("точка А находится в нулевой зоне координат");

		}

	}
}
