package demo4;

import java.util.Scanner;

public class Manager {
	String yh;
	String mm;

	public static void show() {
		Scanner input = new Scanner(System.in);
		Manager p1 = new Manager();
		p1.yh = input.next();
		p1.mm = "123456";
		System.out.println("用户名是：" + p1.yh + "\t" + "密码是：" + p1.mm);
	}

}
