package method.q05;

public class Triangle {

	public static void main(String[] args) {
		int base = 8;
		int height = 5;
		int result = getTriangleArea(base, height);

		System.out.println("底辺:" + base);
		System.out.println("高さ:" + height);
		System.out.println("三角形の面積:" + result);
	}

	public static int getTriangleArea(int base, int height) {
		int triangleArea = base * height / 2;

		return triangleArea;
	}

}
