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
		// System.out.print("�������" + i + "�����" + j + "��ͬѧ�ĵ�" + a + "���ɼ�");
		// int score = input.nextInt();
		// sum += score;
		//
		// }
		// ban += sum;
		// System.out.println("��" + j + "���˵�ƽ�����ǣ�" + sum / 3);
		// }
		// System.out.println("��" + i + "�����ƽ�����ǣ�" + ban / 3);
		// }

		// int[] scores = new int[5];
		// Scanner input = new Scanner(System.in);
		// for (int i = 0; i < 5; i++) {
		// System.out.print("�������" + (i + 1) + "�����֣�");
		// scores[i] = input.nextInt();
		// }
		// for (int i = 0; i < 5; i++) {
		// System.out.println(scores[i]);
		// }

		int sum = 0;
		Scanner input = new Scanner(System.in);
		int[] a = { 8, 4, 2, 1, 23, 344, 12 };
		boolean j = false;
		System.out.println("��������һ������");
		int shu = input.nextInt();
		// System.out.println("ѭ�������");
		for (int i = 0; i < a.length; i++) {
			//
			// System.out.println(a[i]);
			// sum += a[i];
			// }
			// System.out.println("���ǣ�" + sum);
			if (shu == a[i]) {
				j = true;
				System.out.println(i);
				System.out.println("����");
			}
		}

		if (j == false) {
			System.out.println("������");
	}
	}
}
