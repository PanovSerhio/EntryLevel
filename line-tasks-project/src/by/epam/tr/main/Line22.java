package by.epam.tr.main;

public class Line22 {

	public static void main(String[] args) {
		// Дано натуральное число Т, которое представляет длительность прошедшего
		// времени в секундах.
		// Вывести данное значение длительности в часах, минутах и секундах в следующей
		// форме: ННч ММмин SSc.

		int T = 10800;
		int hours = (T / 3600);
		int temp = T - (hours * 3600);
		int minutes = temp / 60;
		int seconds = temp - (minutes * 60);

		System.out.println("Исходная длительность в секундах: " + T);

		if ((hours>=0)&&(hours<= 9)&&(minutes>=0)&&(minutes<=9)&&(seconds>=0)&&(seconds<=9)) {
			System.out.println("0" + hours + " ч. 0" + minutes + " мин. 0" + seconds + " c.");
			
		} else {
			System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");
			
		}
	}
}
