package demo3;

import java.util.Arrays;
import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ��һ��
		String[] shu = new String[5];
		System.out.println("��������仰��");
		for (int i = 0; i < shu.length; i++) {
			System.out.print("�������" + (i + 1) + "�仰��");
			shu[i] = input.next();
		}
		for (int j = shu.length-1; j >= 0; j--) {
			System.out.println(shu[j]);
		}

		// �ڶ���
		// int[] jj = { 1, 3, -1, 5, -2 };
		// System.out.println("ԭ����:");
		// System.out.print("[");
		// for (int i = 0; i < jj.length; i++) {
		// System.out.print(jj[i] + "\t");
		// }
		// System.out.println("]");
		// Arrays.sort(jj);
		// System.out.println("���������:");
		// System.out.print("[");
		// for (int j = 0; j < jj.length; j++) {
		// System.out.print(jj[j] + "\t");
		//
		// }
		// System.out.println("]");

		// ������
//		int[] shu = new int[10];
//		int num = 0;
//		int num1 = 0;
//		int num2 = 0;
//		int num3 = 0;
//		System.out.println("������10������");
//		for (int i = 0; i < shu.length; i++) {
//			shu[i] = input.nextInt();
//		}
//		System.out.print("�����10����Ϊ��");
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
//		System.out.println("����1�ĸ����ǣ�" + num1 + "��");
//		System.out.println("����2�ĸ����ǣ�" + num2 + "��");
//		System.out.println("����3�ĸ����ǣ�" + num3 + "��");
//		System.out.println("�Ƿ����ֵĸ����ǣ�" + num + "��");

	}
}
