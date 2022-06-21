package by.epam.tr.main;

//import java.util.Scanner;

public class Cycle06 {

	public static void main(String[] args) {
		// при введении любого целого положительного числа
		//программа ссумирует все числа от 1 до введенного числа.
				
        int number = 25;
        int i = 1;
        int sum = 0;

        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
        System.out.println();
    }
}
