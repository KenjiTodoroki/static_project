package practice;

public class PracticeDoWhile {

	public static void main(String[] args) {
		int num = 100; // 初期値

		do {
			System.out.println(num);
			num--; // 1を引く
		} while (num >= 0); // numが0になるまで処理を繰り返す
	}

}