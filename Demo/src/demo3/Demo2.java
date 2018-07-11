package demo3;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] arge) {
		// 商场员工工资
		// Scanner input = new Scanner(System.in);
		// System.out.println("请输入基本工资：");
		// double jibe = input.nextDouble();
		// double wujia = jibe*0.4;
		// double fang = jibe*0.25;
		// double xin = jibe+wujia+fang;
		// System.out.println("该员工的工资细目为：");
		// System.out.println("基本工资为："+jibe);
		// System.out.println("物价津贴为："+wujia);
		// System.out.println("房租津贴是："+fang);
		// System.out.println("员工薪水是："+xin);
		//

		
		
		
		// 两个变量的值互换
		// int hei = 10,hon = 8;
		// System.out.println("输出前的手中的纸牌：");
		// System.out.println("左手中的纸牌："+hei);
		// System.out.println("右手中的纸牌："+hon);
		// int a = hei;
		// hei = hon;
		// hon = a;
		// System.out.println("输出后的手中的纸牌：");
		// System.out.println("左手中的纸牌："+hei);
		// System.out.println("右手中的纸牌："+hon);
		// //直接输出
		// int hei = 10,hon = 8;
		// System.out.println("左手中的纸牌："+hon+"\n右手中的纸牌："+hei);

		
		
		
		
		// 银行利息计算
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入本金：");
		 double benjin = input.nextDouble();
		 double yi = 0.0225,er = 0.027,san = 0.0324,si = 0.036;
		 int yi1 = 1,er1 = 2, san1 = 3,si1 = 5;
		 double yi2=benjin*yi*yi1,er2=benjin*er*er1;
		 double san2=benjin*san*san1,si2=benjin*si*si1;
		 System.out.println("本金为："+benjin);
		 System.out.println();
		 System.out.println("存取一年后的本息是："+(yi2+benjin));
		 System.out.println();
		 System.out.println("存取二年后的本息是："+(er2+benjin));
		 System.out.println();
		 System.out.println("存取三年后的本息是："+(san2+benjin));
		 System.out.println();
		 System.out.println("存取四年后的本息是："+(si2+benjin));
		

	}
}
