package basic.q06;

public class ShowSeasons {

	public static void main(String[] args) {
		int[] months = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

		for (int month : months) {

			String season = "";

			switch (month) {
			case 1, 2, 12:
				season = "冬";
				break;
			case 3, 4, 5:
				season = "春";
				break;
			case 6, 7, 8:
				season = "夏";
				break;
			case 9, 10, 11:
				season = "秋";
				break;
			default:
				season = "存在しない";
				break;
			}
			System.out.println(month + "月は" + season + "です。");
		}

	}

}
