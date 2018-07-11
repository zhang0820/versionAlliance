package demo4;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		User  u1 = new User();
		u1.fen =1000;
		u1.ka = "金卡";
		Scanner input = new Scanner(System.in);
		System.out.println("请输入积分：");
		int jifen = input.nextInt();
		System.out.println("请输入卡类：");
		String ka1 = input.next();
		if(jifen >= 5000) {
			System.out.println("获得500积分");
		}else if (jifen >= 1000 && u1.ka.equals(ka1)) {
			System.out.println("获得500积分");
		}else {
			System.out.println("条件不够");
		}
		
		
		
		
//		System.out.print("请输入用户名：");
//		String hym = input.next();
//		System.out.print("请输入密码：");
//		String mim = input.next();
//		if(u1.mm.equals(mim)&&u1.yong.equals(hym)) {
//			System.out.print("请输入新密码：");
//			String xing = input.next();
//			System.out.println("修改成功");
//		}else {
//			System.out.println("用户名不匹配！");
//		}
		
		
		
		
		
	}
}
class User{
	String yong = "zhang";
	String mm = "123456";
	
	String ka;
	int fen;
	
}

