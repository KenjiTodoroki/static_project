package practice;

public class PracticeForEach {

	public static void main(String[] args) {
		// 文字型配列nameを作成し複数の名前を入れる
		String name[] = { "田原", "福尾", "倉成", "濱野", "前村", "重永", "高林", "鈴木", "渡辺", "大濱", "室内", "栗田", "轟木", "木村" };

		for (String order : name) { // 配列nameから順番に要素を取り出して処理をする為に拡張for文を使って変数orderを定義
			System.out.println(order); // 変数orderを出力
		}
	}

}