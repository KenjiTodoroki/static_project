package practice;

public class PracticeFor {

	public static void main(String[] args) {
		int sum = 0; // 初期値

		for (int i = 1; i <= 100; i++) {
			sum += i; // iの値ずつ足していく
		}
		System.out.println(sum);
	}
	
}