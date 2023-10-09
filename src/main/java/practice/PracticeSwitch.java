package practice;

public class PracticeSwitch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ		
		int[] numbers = {1, 2, 4, 1, 5, 5, 2, 1, 3, 1};
				
		for (int number : numbers) {
						
			String job;
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
			default:
				job = "魔法剣士";
				break;
			}
			System.out.println(number + ":" + job);
		}
	}
}