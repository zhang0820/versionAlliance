package demo3;

import java.util.Scanner;

public class Pay {
	public static void main(String[] args) {
		
		int tx = 245;
		int wqx = 570;
		int wqp = 320;
		int tx1 = 2;
		int wqx1 = 1;
		int wqp1 = 1;
		double zk = 0.8;
		Scanner input=new Scanner(System.in);
		System.out.println("* * * * * * * * * * *  消费单 * * * * * * * * * * * * ");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T袖"+"\t"+"￥245"+"\t"+"2"+"\t"+"￥490");
		System.out.println("网球鞋"+"\t"+"￥570"+"\t"+"1"+"\t"+"￥570");
		System.out.println("网球拍"+"\t"+"￥320"+"\t"+"1"+"\t"+"￥320");
		System.out.println();
		System.out.println("折扣"+"\t"+"8折");
		double zong = (tx*tx1+wqp*wqp1+wqx*wqx1)*0.8;
		System.out.println("消费总金额"+"￥"+zong);
		System.out.println("实际交费：");
		double a = input.nextDouble();
		System.out.println("找钱"+(a-zong));
		double jf =(int)zong*3/100;
		System.out.println("本次购物所有获得积分是"+jf);
		
	}

}
