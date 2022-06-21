package by.epam.tr.main;

public class Cycle09 {

	public static void main(String[] args) {
		// najty summu kvadratov pervih sta chisel.
		
		/*int x = 0;
		int sum = 0;
		
		while(x <= 100) {
			x++;
			sum = sum + (x * x);
		}
		System.out.println(sum);*///348551, тут значение больше
		
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + (i * i);
		}
		System.out.println("сумма квадратов = " + sum);//338350 (разница 10 201, это 101х101)

	}

}
