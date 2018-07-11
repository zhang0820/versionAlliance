package demo3;

import java.util.Arrays;
import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 第一题
		String[] shu = new String[5];
		System.out.println("请输入五句话：");
		for (int i = 0; i < shu.length; i++) {
			System.out.print("请输入第" + (i + 1) + "句话：");
			shu[i] = input.next();
		}
		for (int j = shu.length-1; j >= 0; j--) {
			System.out.println(shu[j]);
		}

		// 第二题
		// int[] jj = { 1, 3, -1, 5, -2 };
		// System.out.println("原数组:");
		// System.out.print("[");
		// for (int i = 0; i < jj.length; i++) {
		// System.out.print(jj[i] + "\t");
		// }
		// System.out.println("]");
		// Arrays.sort(jj);
		// System.out.println("排序后数组:");
		// System.out.print("[");
		// for (int j = 0; j < jj.length; j++) {
		// System.out.print(jj[j] + "\t");
		//
		// }
		// System.out.println("]");

		// 第三题
//		int[] shu = new int[10];
//		int num = 0;
//		int num1 = 0;
//		int num2 = 0;
//		int num3 = 0;
//		System.out.println("请输入10个数：");
//		for (int i = 0; i < shu.length; i++) {
//			shu[i] = input.nextInt();
//		}
//		System.out.print("输入的10个数为：");
//		for (int i = 0; i < shu.length; i++) {
//			System.out.print(shu[i] + "  ");
//		}
//		for (int j = 0; j < shu.length; j++) {
//			if (shu[j] == 1) {
//				num1++;
//			} else if (shu[j] == 2) {
//				num2++;
//			} else if (shu[j] == 3) {
//				num3++;
//			} else {
//				num++;
//			}
//		}
//		System.out.println();
//		System.out.println("数字1的个数是：" + num1 + "个");
//		System.out.println("数字2的个数是：" + num2 + "个");
//		System.out.println("数字3的个数是：" + num3 + "个");
//		System.out.println("非法数字的个数是：" + num + "个");

	}
}
