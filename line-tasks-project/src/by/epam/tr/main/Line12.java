package by.epam.tr.main;

public class Line12 {

	public static void main(String[] args) {
		// найти расстояние между двумя точками с данными координатами:
		// (x1,y1) (x2,y2)
		
		double x1 = 2;
		double x2 = 4;
		double y1 = 3;
		double y2 = 5;
		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("Расстояние между (" + x1 + ", " + y1 + ") и (" + x2 + ", " + y2 + ") равно " + length);

	}

}
