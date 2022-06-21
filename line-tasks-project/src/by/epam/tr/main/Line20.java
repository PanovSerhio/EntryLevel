package by.epam.tr.main;

public class Line20 {

	public static void main(String[] args) {
		// »звестна длина окружности. Ќайти площадь круга, ограниченного этой окружностью
		
		double length = 5.3;

        double r = length / (2 * Math.PI);
        double s = Math.PI * r * r;

        System.out.println("R радиус круга = " + r + "\n длина окружности равна " + length + "\n площадь круга равна " + s);

	}

}
