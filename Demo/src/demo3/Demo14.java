package demo3;

import java.util.Scanner;


public class Demo14 {
	public static void main(String[] args) {
		// int shu = 3;
		//
		// Scanner input = new Scanner(System.in);
		// for (int i = 1; i <= shu; i++) {
		// double ban = 0;
		// for (int j = 1; j <= shu; j++) {
		// double sum = 0;
		// for (int a = 1; a <= shu; a++) {
		// System.out.print("请输入第" + i + "个班第" + j + "个同学的第" + a + "个成绩");
		// int score = input.nextInt();
		// sum += score;
		//
		// }
		// ban += sum;
		// System.out.println("第" + j + "个人的平均分是：" + sum / 3);
		// }
		// System.out.println("第" + i + "个班的平均分是：" + ban / 3);
		// }

		// int[] scores = new int[5];
		// Scanner input = new Scanner(System.in);
		// for (int i = 0; i < 5; i++) {
		// System.out.print("请输入第" + (i + 1) + "个数字：");
		// scores[i] = input.nextInt();
		// }
		// for (int i = 0; i < 5; i++) {
		// System.out.println(scores[i]);
		// }

		int sum = 0;
		Scanner input = new Scanner(System.in);
		int[] a = { 8, 4, 2, 1, 23, 344, 12 };
		boolean j = false;
		System.out.println("任意输入一个数：");
		int shu = input.nextInt();
		// System.out.println("循环输出：");
		for (int i = 0; i < a.length; i++) {
			//
			// System.out.println(a[i]);
			// sum += a[i];
			// }
			// System.out.println("和是：" + sum);
			if (shu == a[i]) {
				j = true;
				System.out.println(i);
				System.out.println("存在");
			}
		}

		if (j == false) {
			System.out.println("不存在");
	}
	}
}
