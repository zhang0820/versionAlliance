package demo3;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		System.out.println("MyShopping管理系统》客户信息管理》添加客户信息\n");
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
		System.out.print("请输入会员卡号(4位数)：");
		int ka = input.nextInt();
		System.out.print("请输入会员生日(月/日)：");
		String sheng = input.next();
		System.out.print("请输入会员积分：");
		int fen = input.nextInt();
		System.out.println("您录入的会员信息是：");
		System.out.println(ka+"\t"+sheng+"\t"+fen);
		System.out.println();
		}
		System.out.println("程序结束");
	} 
		
}
