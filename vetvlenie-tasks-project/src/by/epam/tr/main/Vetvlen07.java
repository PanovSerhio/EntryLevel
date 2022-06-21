package by.epam.tr.main;
public class Vetvlen07 {

	public static void main(String[] args) {
		// нахождение модуля выражения a*x*x+b*x+c
		int a = 2;
		int b = 5;
		int c = 8;
		int x = -3;
		int result = a * x * x + b * x + c;
		
		if(result < 0){
			result = result * -1;
		}
		System.out.println("модуль выражения = " + result);
		
	}

}
