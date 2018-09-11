import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Simple simple = new Laba();
		Palyndrom palyndrom = new Palyndrom();

		System.out.println("Простые числа - 1;");
		System.out.println("Палиндром - 2;");

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		if (num == 1) {
			simple.startSearchSimple();
		} else if (num == 2) {
			palyndrom.startPalyndrom();
		} else {
			System.out.println("Ошибка ввода")
		}

	}
}