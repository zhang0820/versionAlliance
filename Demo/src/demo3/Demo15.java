package demo3;

import java.util.Arrays;
import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
//		double[] shu = new double[5];
//		double sum = 0.0;
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入会员本月的消费记录：");
//		for (int i = 0; i < shu.length; i++) {
//			System.out.print("请输入第" + (i + 1) + "笔购物金额");
//			shu[i] = input.nextDouble();
//			sum += shu[i];
//		}
//		System.out.println("\n序号\t\t金额(元)");
//		for (int i = 0; i < shu.length; i++) {
//			System.out.println((i + 1) + "\t\t" + shu[i]);
//		}
//		System.out.println("总金额\t\t" + sum);

		
		
		

//		int[] shu = { 15, 156, 694, 263, 546, 256 };
//		Arrays.sort(shu);
//		for (int i = shu.length - 1; i >= 0; i--) {
//			System.out.println(shu[i]);
//		}

		
//		int[] shu1 = { 15, 156, 694, 263, 546, 256 };
//		Arrays.sort(shu1);
//		for (int i = 0; i < shu1.length; i++) {
//			System.out.println(shu1[i]);
//		}
		
		
		
		
		int[] scores = { 15, 156, 694, 263, 546, 256 };
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < max) {
				max = scores[i];
			}
		}
		System.out.println("考试成绩最低是：" + max);

		Scanner input = new Scanner(System.in);
		int[] list = new int[6];
		list[0]=99;
		list[1]=85;
		list[2]=82;
		list[3]=63;
		list[4]=60;
		
		int shu = list.length;
		System.out.print("请输入新增成绩：");

		int num = input.nextInt();
		for(int i =0;i<list.length;i++) {
			if(num >list[i]) {
				shu = i;
				break;
			}
		}
		for(int j = list.length-1;j>shu;j--) {
			list[j]=list[j-1];
		}
		list[shu] = num;
		System.out.println("插入成绩的下标是："+shu);
		System.out.println("插入成绩的下标是：");
		for(int k = 0;k<list.length;k++) {
			System.out.print(list[k]+"\t");
		}
		
	
	    

	}
	
}
