import java.util.Scanner;

public class Palyndrom {

	public Palyndrom() {

	}

	public void startPalyndrom() {
		printStartInfo();
		String str = getYourWord();
		printResult(isPalindrom(str))
	}

	private boolean isPalindrom(String str) {
		char[] array = str.toCharArray();
		int k = 0;
		for(int i = 0; i < str.length()/2; i++) {
			if(array[i] != array[str.length() - i - 1]) {
				return false;
			}
		}
		return true;
	}

	private String getYourWord() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	private void printStartInfo() {
		System.out.println();
		System.out.println("Введите слово на проверку");
	}

	private void printResult(boolean bool) {
		if(bool) {
			System.out.println("Палиндром")
		} else {
			System.out.println("Не палиндром")
		}
		
	}  
}