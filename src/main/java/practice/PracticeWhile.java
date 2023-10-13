package practice;

public class PracticeWhile {

	public static void main(String[] args) {
		int num = 100; // 初期値

		System.out.println(num); // 100を表示 

		while (num > 0) { // numが0になるまで処理を繰り返す
			num--; // 1ずつ引く
			System.out.println(num); // 変数numを表示
		}
	}
	
}