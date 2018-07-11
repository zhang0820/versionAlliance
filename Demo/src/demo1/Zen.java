package demo1;

public class Zen {
	public static void main(String[] args) {

		int a = 6;
		a++;
		int b = 18;
		b++;
		if (b % a == 0) {
			System.out.println("可以整除");
		} else {
			System.out.println("不能整除");
		}
	}
}
