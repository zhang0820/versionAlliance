package demo2;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		String fu = "y";

		for (int i = 0; i < 5; i++) {
			System.out.println("��ӭ���ٵ�" + (i + 1) + "�ҵ�");

			for (int j = 0; j < 3; j++) {
				System.out.println("Ҫ�뿪��(y/n)");
				String fo = input.next();
				if (fo.equals(fu)) {
					System.out.println("����һ���·�");
					num++;
				} else {
					System.out.println("���");
					break;
				}
			}
		}
		System.out.println("һ������"+num+"���·�");

		// ð������
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
