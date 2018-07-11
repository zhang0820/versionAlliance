package demo2;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] er = new String[8];
		boolean isExit = false;
		System.out.print("请输入字符：");
		for (int i = 0; i < er.length; i++) {

			er[i] = input.next();
		}
		System.out.println("请用户输入要删除的字符：");
		String zhi = input.next();
		int shu = 999;
		
		for (int i = 0; i < er.length; i++) {
			if (zhi.equals(er[i])) {
				System.out.println("找到了");
				shu = i;
				isExit = true;
			}
		}
		if (isExit == true) {
			
			for (int j = shu; j < er.length - 1; j++) {
				er[j] = er[j + 1];
			}
			er[er.length - 1] = " ";
			for (int i = 0; i < er.length; i++) {
				System.out.println(er[i]);
			}
		} else {
			System.out.println("没找到");
		}
	}

}
