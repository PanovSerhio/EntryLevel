package by.epam.tr.main;

public class Vetvlen17 {

	public static void main(String[] args) {
		// даны целые числа m,n. если они равны, то заменить каждое из ниходним и тем же
		// числом, равным большему из исходных, а если равны, заменить нулями

		double m = 3;
		double n = 3;

		if (m != n) {
			if (m > n) {
				n = m;

			} else {
				m = n;
			}
		} else {
			m = 0;
			n = 0;
		}
		System.out.println("число m = " + m + " и число n = " + n);
	}

}
