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
		System.out.println(sum);*///348551, ��� �������� ������
		
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + (i * i);
		}
		System.out.println("����� ��������� = " + sum);//338350 (������� 10 201, ��� 101�101)

	}

}
