package by.epam.tr.main;

public class Line06 {

	public static void main(String[] args) {
		// в "н" малых бидонах 80л. молока. Сколько литров молока с "м" больших бидонах
		//если в каждом большом бидоне на 12л. больше?
		
		double n = 10;//количество n малых бидонов
		double nVolume = 80;//всего литров в малых бидонах
		double nLiter = nVolume / n;//количество литров в ОДНОМ малом бидоне
		
		double m = 5;//кол-во больших бидонов
		double mLiter = nLiter + 12;//кол-во литров в ОДНОМ большом бидоне
		double mVolume = mLiter * m;//общее кол-во литров в m больших бидонов
		
		System.out.println("в одном большом бидоне помещается " + mLiter + " литров молока");
		System.out.println("в " + m + " больших бидонах " + mVolume + " литров молока");

	}

}
