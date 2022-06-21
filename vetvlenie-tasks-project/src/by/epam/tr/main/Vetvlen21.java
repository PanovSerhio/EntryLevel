package by.epam.tr.main;

public class Vetvlen21 {

	public static void main(String[] args) {
		// вывести на экран вопрос:"Кто ты, мальчик или девочка? Введи Д или М." если М
		// - выводится "Мне нравятся девочки"
		// если Д - выводится "Мне нравятся мальчики"

		char answer = 'Д';
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		System.out.println(answer);

		switch (answer) {
		case 'М':
			System.out.println("Мне нравятся девочки!");
			break;
		case 'Д':
			System.out.println("Мне нравятся мальчики!");
			break;
		default:
			System.out.println("Неверное значение!");
		}
		System.out.println();
	}

}
