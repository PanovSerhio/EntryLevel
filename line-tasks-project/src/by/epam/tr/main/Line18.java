package by.epam.tr.main;

public class Line18 {

	public static void main(String[] args) {
		// Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба/
		
		double a = 4.5;

        double s = a * a;
        double sCommon = s * 6;
        double v = Math.pow(a, 3);

        System.out.println("Площадь грани равна " + s);
        System.out.println("Площадь полной поверхности равна " + sCommon);
        System.out.println("Объем куба равен " + v);
        System.out.println();

	}

}
