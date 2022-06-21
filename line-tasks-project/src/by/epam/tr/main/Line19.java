package by.epam.tr.main;

public class Line19 {

	public static void main(String[] args) {
		// Дана сторона равностороннего треугольника. Найти площадь этого треугольника, 
		//его высоту, радиусы вписанной и описанной окружностей
		
		double a = 1.5;

        double s = (a * a * Math.sqrt(3)) / 4;
        double h = a * Math.sqrt(3) / 2;
        double radIn = a * Math.sqrt(3) / 6;
        double radOut = a * Math.sqrt(3) / 3;

        System.out.println("Площадь треугольника = " + s);
        System.out.println("Высота треугольника =  " + h);
        System.out.println("Радиус вписанной окружности = " + radIn);
        System.out.println("Радиус описанной окружности = " + radOut);
        System.out.println();

	}

}
