package demo3;

import java.util.Arrays;
import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {
		// 第四题
		/*
		 * char[] a = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		 * System.out.println("原字符序列:"); 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * System.out.print(a[i] + "\t"); 
		 * } 
		 * System.out.println();
		 *  Arrays.sort(a);
		 * System.out.println("升序排序后:"); 
		 * for (int j = 0; j < a.length; j++) {
		 * 
		 * System.out.print(a[j] + "\t"); 
		 * } 
		 * System.out.println();
		 *  Arrays.sort(a);
		 * System.out.println("逆序输出为:");
		 *  for (int k = a.length - 1; k >= 0; k--) {
		 * 
		 * System.out.print(a[k] + "\t"); }
		 */

		// 第五题
		Scanner input = new Scanner(System.in);
		int index = -1;
		char[] yuans = new char[9];

		System.out.println("请输入字符：");
		for (int i = 0; i < yuans.length - 1; i++) {
			yuans[i] = input.next().charAt(0);
		}
		Arrays.sort(yuans);
		System.err.print("原字符:");
		for (char yuan : yuans) {
			System.out.print(yuan + " ");
		}

		System.out.println(" ");
		System.out.print("待插入的字符是：");
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
		System.out.println("插入的下标是：" + index);

		System.out.println("插入后的字符是：");
		for (char shu : yuans) {
			System.out.print(shu + " ");
		}
//	}
		
		
		
//第六题
//		Scanner input = new Scanner(System.in);
//		int[] jia = new int[4];
//		int max = jia[0];
//		System.out.println("请输入4家店的价格：");
//		for (int i = 0; i < jia.length; i++) {
//			System.out.print("请输入第" + (i + 1) + "家店的价格：");
//			jia[i] = input.nextInt();
//		}
//		for (int i = 1; i > jia.length; i++) {
//			if (jia[i] < max) {
//				max = jia[i];
//			}
//			System.out.print("最低价格是：" + jia[0]);
//		}
	}


}



