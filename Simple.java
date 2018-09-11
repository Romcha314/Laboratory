import java.util.Scanner;

public class Simple {

	public Simple() {
		
	}

	public void startSearchSimple() {
		int N = enterYourNumber();
		for (int i = 2; i <= N; i++) {
			if (isSimple(i)) {
				System.out.println(N);
			}
		}
	}

	private boolean isSimple(int N) {
		for(int i = 2; i < N; i++) {
			if(N % i == 0) {
				return false;
			} 
		} 
		return true;
	}

	private int enterYourNumber() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}