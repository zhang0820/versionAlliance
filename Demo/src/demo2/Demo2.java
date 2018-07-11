package demo2;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		String fu = "y";

		for (int i = 0; i < 5; i++) {
			System.out.println("欢迎光临第" + (i + 1) + "家店");

			for (int j = 0; j < 3; j++) {
				System.out.println("要离开吗？(y/n)");
				String fo = input.next();
				if (fo.equals(fu)) {
					System.out.println("买了一件衣服");
					num++;
				} else {
					System.out.println("离店");
					break;
				}
			}
		}
		System.out.println("一共买了"+num+"件衣服");

		// 冒泡排序
		// int[] arr = { 5, 16, 25, 90, 23 };
		// for (int i = 0; i < arr.length - 1; i++) {
		// for (int j = 0; j < arr.length - 1 - i; j++) {
		// if (arr[j] > arr[j + 1]) {
		// int temp = arr[j];
		// arr[j] = arr[j + 1];
		// arr[j + 1] = temp;
		// }
		// }
		//
		// }
		// for (int i = 0; i < arr.length; i++) {
		// System.out.println(arr[i]);
		// }

	}
}
