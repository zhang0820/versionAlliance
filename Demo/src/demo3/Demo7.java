package demo3;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {

		// 输入一批整数,输出最大值与最小值,遇0结束
		 int num;
		 Scanner input = new Scanner(System.in);
		 System.out.print("请输入一个整数(按0结束):");
		 num = input.nextInt();
		 int max = num;
		 int min = num;
		 do {
		 System.out.print("请输入一个整数(按0结束):");
		 num = input.nextInt();
		 if (num > max && num != 0) {
		 max = num;
		 } else if (num < min && num != 0) {
		 min = num;
		 }
		
		 } while (num != 0);
		 System.out.println("最大的数是" + max + "最小的数是" + min);

//		Scanner input = new Scanner(System.in);
//		for (int i = 0; i < 10000; i++) {
//			System.out.print("请输入数字1-7(输入0结束)：");
//			int shu = input.nextInt();
//			if (shu != 0) {
//				switch (shu) {
//				case 1:
//					System.out.println("MON");
//					break; // break,表示跳出switch
//				case 2:
//					System.out.println("TUE");
//					break;
//				case 3:
//					System.out.println("WED");
//					break;
//				case 4:
//					System.out.println("THU");
//					break;
//				case 5:
//					System.out.println("FRI");
//					break;
//				case 6:
//					System.out.println("SAT");
//					break;
//				case 7:
//					System.out.println("SUN");
//					break;
//				default:
//					System.out.println("输入错误请重新输入：");
//			}
//			} else if (shu == 0) {
//				System.out.println("程序结束");
//				break;
//			}
//		}
	}
}
