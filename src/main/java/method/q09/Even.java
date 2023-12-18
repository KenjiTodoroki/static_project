package method.q09;

public class Even {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 5;
		String checkEven1 = checkEven(number1);
		String checkEven2 = checkEven(number2);

		System.out.println(number1 + "は" + checkEven1 + "です。");
		System.out.println(number2 + "は" + checkEven2 + "です。");
	}

	public static String checkEven(int number) {
		if (number % 2 == 0) {
			return "偶数";
		} else {
			return "奇数";
		}
	}

}
