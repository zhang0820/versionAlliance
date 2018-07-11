package demo2;

import java.util.Scanner;

public class Shu {
	public static void main(String[] args) {
		// 跑进10秒进入决赛，进了决赛根据性别进行分组
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的跑步成绩：");
		int time = input.nextInt();
		System.out.print("请输入您的性别(男/女)：");
		String sex = input.next();
		if (time < 10) {
			if (sex.equals("男")) {
				System.out.print("您进入了男子组决赛");
			} else if (sex.equals("女")) {
				System.out.print("您进入了女子组决赛");
			} else {
				System.out.print("对不起，您的性别不符合参赛要求");
			}
		} else {
			System.out.print("对不起，成绩不合格，进不了决赛");
		}
	}

}
