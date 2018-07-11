package demo4;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cell d1 = new Cell();
		
		
		
		
		
		// Dian d2 = new Dian();
		// System.out.println("请输入java成绩：");
		// d2.java = input.nextDouble();
		// System.out.println("请输入C成绩：");
		// d2.C = input.nextDouble();
		// System.out.println("请输入DB成绩：");
		// d2.DB = input.nextDouble();
		// double num = d2.C + d2.DB + d2.java;
		// System.out.println("总成绩是：" + num);
		// double avg = num / 3;
		// System.out.println("平均成绩是：" + avg);
	}
}

// 电池
class Cell {
	String pinpai;

	public void pub() {
		System.out.println("续电");
	}

}

class Dian {
	double java;
	double C;
	double DB;
}
