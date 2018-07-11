package demo3;
//购物结算

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		String name = ""; // 商品名称
		double price = 0.0; // 商品价格
		int goodsNo = 0; // 商品编号
		int amount = 0; // 购买数量
		double discount = 0.8; // 折扣比例
		double total = 0.0; // 商品总价
		double payment = 0.0; // 实付金额

		// 商品清单
		System.out.println("*******************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T 恤        2.网球鞋        3.网球拍");
		System.out.println("*******************************************");

		Scanner input = new Scanner(System.in);
		String answer = "y"; // 标识是否继续

		while ("y".equals(answer)) {
			System.out.print("\n请输入商品编号：");
			goodsNo = input.nextInt();
			switch (goodsNo) {
			case 1:
				name = "T 恤";
				price = 245;
				break;
			case 2:
				name = "网球鞋";
				price = 899;
				break;
			case 3:
				name = "网球拍";
				price = 320;
				break;
			}
			System.out.print("请输入购买数量：");
			amount = input.nextInt();
			System.out.println(name + "￥" + price + "\t数量 " + amount + "\t合计 ￥" + price * amount);
			total += price * amount;
			System.out.print("是否继续（y/n）");
			answer = input.next();
		}
		System.out.println("\n折扣：" + discount);
		System.out.println("应付金额：" + total * discount);
		System.out.print("实付金额：");
		payment = input.nextDouble();
		while (payment - total * discount < 0) {
			System.out.print("您输入的金额小于应付金额，请重新输入：");
			payment = input.nextDouble();
		}
		System.out.println("找钱：" + (payment - total * discount));
	}
	
//	
//	double c=0;
//	int i=0;
//	double f;
//	do{
//	f=c*9/5+32;
//	System.out.println("摄氏温度:"+c+"度,华氏温度:"+f+"度");
//	c+=20;
//	i++;
//	}while(i<=10&&c<=250);

//}
}