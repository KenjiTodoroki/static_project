package practice;

public class PracticeSwitch {

	public static void main(String[] args) {		
		int[] numbers = { 1, 2, 4, 1, 5, 5, 2, 1, 3, 1 }; // 要素が10個入るint型の配列を作成

		for (int number : numbers) { // 拡張for文を使い配列の要素を順番に取り出すint型の変数を定義
			// String型変数jobを定義して空文字を入れる
			String job = "";
			// switch文を使って各番号に変数jobの値をそれぞれ各ジョブの要素を入れる
			switch (number) {
			case 1:
				job = "勇者";
				break;
			case 2:
				job = "バトルマスター";
				break;
			case 3:
				job = "パラディン";
				break;
			case 4:
				job = "海賊";
				break;
			case 5:
				job = "魔法剣士";
				break;
			}
			// 要素を足して出力
			System.out.println(number + ": " + job);
		}
	}
}