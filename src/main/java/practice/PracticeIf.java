package practice;

public class PracticeIf {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int integer = 0; // 初期値

		for (int i = 1; i <= 100; i++) { // int型ループカウンタ変数iを使用して1から100になるまで1を足していく
			integer = i; // 変数integerにループカウンタ変数を代入

			if (integer % 3 == 0 && integer % 5 == 0) { // if文を使い3と5で割り切れる数字の時の処理
				System.out.println("FizzBuzz");
			} else if (integer % 3 == 0) { // 3で割り切れる時の処理
				System.out.println("Fizz");
			} else if (integer % 5 == 0) { // 5で割り切れる時の処理
				System.out.println("Buzz");
			} else { // 3でも5でも割り切れない時の処理
				System.out.println(integer);
			}
		}
	}
}