package by.epam.tr.main;

public class Line21 {

	public static void main(String[] args) {
		// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). " +
    //Поменять местами дробную и целую части числа и вывести полученное значение числа.
		
		double x = 123.456;
		
		int firstNum = (int) x;
        int secondNum = (int)((x - firstNum) * 1000);
        double result = secondNum + firstNum * 0.001;
        
        System.out.println((int)x);
        System.out.println("Исходное число " + x);
        System.out.println("Полученное число " + result);

	}

}
