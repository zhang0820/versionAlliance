package menu;

import java.beans.beancontext.BeanContext;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class TestMenu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] users = new String[5]; 

		for (int i = 0; i < users.length; i++) {

			System.out.println("请输入客户姓名：");
			users[i] = input.next();
		}
		System.out.println("**********************************************\n");
		System.out.println("\t\t客户姓名列表");
		System.out.println("**********************************************\n");
		for (int i = 0; i < users.length; i++) {
			System.out.print(users[i] + "\t");

		}
		System.out.println();
		System.out.println("请输入您要修改的用户名：");
		String user = input.next();
		boolean xu = false;
		for (int i = 0; i < users.length; i++) {
			if (user.equals(users[i])) {
				xu = true;
				System.out.println("请输入新的用户名：");
				String user1 = input.next();
				users[i] = user1;
				System.out.println("修改成功！");
				System.out.println("**************修改结果*************************");
				System.out.println("**********************************************\n");
				System.out.println("\t\t客户姓名列表");
				System.out.println("**********************************************\n");
				for (int j = 0; j < users.length; j++) {
					System.out.print(users[j] + "\t");
				}
				break;
			}
		}
		if (!xu)
			System.out.println("没有此用户！");
	}
}
