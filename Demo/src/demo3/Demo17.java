package demo3;

import java.util.Arrays;
import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {
		// ������
		/*
		 * char[] a = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		 * System.out.println("ԭ�ַ�����:"); 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * System.out.print(a[i] + "\t"); 
		 * } 
		 * System.out.println();
		 *  Arrays.sort(a);
		 * System.out.println("���������:"); 
		 * for (int j = 0; j < a.length; j++) {
		 * 
		 * System.out.print(a[j] + "\t"); 
		 * } 
		 * System.out.println();
		 *  Arrays.sort(a);
		 * System.out.println("�������Ϊ:");
		 *  for (int k = a.length - 1; k >= 0; k--) {
		 * 
		 * System.out.print(a[k] + "\t"); }
		 */

		// ������
		Scanner input = new Scanner(System.in);
		int index = -1;
		char[] yuans = new char[9];

		System.out.println("�������ַ���");
		for (int i = 0; i < yuans.length - 1; i++) {
			yuans[i] = input.next().charAt(0);
		}
		Arrays.sort(yuans);
		System.err.print("ԭ�ַ�:");
		for (char yuan : yuans) {
			System.out.print(yuan + " ");
		}

		System.out.println(" ");
		System.out.print("��������ַ��ǣ�");
		char y = input.next().charAt(0);
		for (int i = 1; i < yuans.length; i++) {
			if (y < yuans[i]) {
				index = i - 1;
				break;
			}if (y > yuans.length - 1) {
				index = yuans.length - 1;
			}
		}
		for (int i = 1; i <= index; i++) {
			yuans[i - 1] = yuans[i];
		}
		yuans[index] = y;
		System.out.println("������±��ǣ�" + index);

		System.out.println("�������ַ��ǣ�");
		for (char shu : yuans) {
			System.out.print(shu + " ");
		}
//	}
		
		
		
//������
//		Scanner input = new Scanner(System.in);
//		int[] jia = new int[4];
//		int max = jia[0];
//		System.out.println("������4�ҵ�ļ۸�");
//		for (int i = 0; i < jia.length; i++) {
//			System.out.print("�������" + (i + 1) + "�ҵ�ļ۸�");
//			jia[i] = input.nextInt();
//		}
//		for (int i = 1; i > jia.length; i++) {
//			if (jia[i] < max) {
//				max = jia[i];
//			}
//			System.out.print("��ͼ۸��ǣ�" + jia[0]);
//		}
	}


}



