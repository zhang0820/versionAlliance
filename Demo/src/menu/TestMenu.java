package menu;

import java.beans.beancontext.BeanContext;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class TestMenu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] users = new String[5]; 

		for (int i = 0; i < users.length; i++) {

			System.out.println("������ͻ�������");
			users[i] = input.next();
		}
		System.out.println("**********************************************\n");
		System.out.println("\t\t�ͻ������б�");
		System.out.println("**********************************************\n");
		for (int i = 0; i < users.length; i++) {
			System.out.print(users[i] + "\t");

		}
		System.out.println();
		System.out.println("��������Ҫ�޸ĵ��û�����");
		String user = input.next();
		boolean xu = false;
		for (int i = 0; i < users.length; i++) {
			if (user.equals(users[i])) {
				xu = true;
				System.out.println("�������µ��û�����");
				String user1 = input.next();
				users[i] = user1;
				System.out.println("�޸ĳɹ���");
				System.out.println("**************�޸Ľ��*************************");
				System.out.println("**********************************************\n");
				System.out.println("\t\t�ͻ������б�");
				System.out.println("**********************************************\n");
				for (int j = 0; j < users.length; j++) {
					System.out.print(users[j] + "\t");
				}
				break;
			}
		}
		if (!xu)
			System.out.println("û�д��û���");
	}
}
