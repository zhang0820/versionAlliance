package menu;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum = 0;
		System.out.println("������һ��������");
		int n = input.nextInt();
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}
}
