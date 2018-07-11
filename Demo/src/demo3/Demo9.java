package demo3;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用MyShopping管理系统");
		System.out.println("");
		System.out.println("*************************************");
		System.out.println("\t1.客户信息管理");
		System.out.println("\t2.购物结算");
		System.out.println("\t3.真情回顾");
		System.out.println("\t4.注销");
		System.out.println("*************************************");
		System.out.println("");
		System.out.print("请选择，输入数字：");
		int shu = input.nextInt();
		boolean fao=true;
		do {
		switch(shu) {
		case 1:
			System.out.println("客户信息管理");
			fao=false;
			break;
		case 2:
			System.out.println("购物结算");
			fao=false;
			break;
		case 3:
			System.out.println("真情回顾");
			fao=false;
			break;
		case 4:
			System.out.println("注销");
			fao=false;
			break;
		default:
			System.out.print("输入错误，请重新输入:");
			shu = input.nextInt();
			break;
		}
		}while(fao);
		System.out.println("程序结束");
	}

}
