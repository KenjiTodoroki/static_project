package method.q09;

public class Even {

	public static void main(String[] args) {
		int[] numbers = { 10, 5 };

		for (int number : numbers) {
			if (checkEven(number)) {
				System.out.println(number + "は偶数です。");
			} else {
				System.out.println(number + "は奇数です。");
			}
		}

	}

	public static boolean checkEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
