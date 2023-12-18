package method.q04;

public class SumNumbers {

	public static void main(String[] args) {
		int number1 = 3;
		int number2 = 2;
		int result = calculateSum(number1, number2);

		System.out.println("第一引数:" + number1);
		System.out.println("第二引数:" + number2);
		System.out.println("加算結果:" + result);
	}

	public static int calculateSum(int number1, int number2) {
		int sum = number1 + number2;

		return sum;
	}

}
