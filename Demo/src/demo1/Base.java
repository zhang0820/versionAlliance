package demo1;

import java.util.Scanner;

public class Base {

	public static void main(String[] args) {
		System.out.print("请输入购买的水果的数量");
		Scanner sy= new Scanner(System.in);
		double v1 = sy.nextInt();
		double sum1 = v1 * 5;
		System.out.print("请输入购买的食品的数量");
		double v2 = sy.nextInt();
		double sum2 =v2 * 8;
		double ss = sum1 + sum2;
		System.out.print("------" + ss);

	}

}
