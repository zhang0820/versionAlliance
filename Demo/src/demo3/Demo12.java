package demo3;


import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 用户正确登陆用户名
		String USER = "jim";
		// 用户正确登陆密码
		String PWD = "123456";
		int num = 0;
		for (int i = 3; i > 0; i++) {
			System.out.print("请输入用户名：");
			String name = input.next();
			System.out.print("请输入密码：");
			String pass = input.next();

			if (name.equals(USER) && pass.equals(PWD)) {
				System.out.println("欢迎登陆MyShoping系统!");
				break;
			} else {
				// 错误一次,自增一次,当num=3的时候,程序将跳出本次循环,不再执行!
				num++;
				// 判断用户还有几次登陆机会!
				int a = 4 - num;
				if (a > 0) {
					System.out.println("输入错误!您还有" + a + "次机会");
				} else {
					// 如果3次都没有输入正确,程序将终止!
					System.out.println("对不起,输入错误3次,本程序将终止!");
					System.exit(0);
				}
			}
		} 
	}
}
