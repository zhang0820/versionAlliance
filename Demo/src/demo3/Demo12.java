package demo3;


import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// �û���ȷ��½�û���
		String USER = "jim";
		// �û���ȷ��½����
		String PWD = "123456";
		int num = 0;
		for (int i = 3; i > 0; i++) {
			System.out.print("�������û�����");
			String name = input.next();
			System.out.print("���������룺");
			String pass = input.next();

			if (name.equals(USER) && pass.equals(PWD)) {
				System.out.println("��ӭ��½MyShopingϵͳ!");
				break;
			} else {
				// ����һ��,����һ��,��num=3��ʱ��,������������ѭ��,����ִ��!
				num++;
				// �ж��û����м��ε�½����!
				int a = 4 - num;
				if (a > 0) {
					System.out.println("�������!������" + a + "�λ���");
				} else {
					// ���3�ζ�û��������ȷ,������ֹ!
					System.out.println("�Բ���,�������3��,��������ֹ!");
					System.exit(0);
				}
			}
		} 
	}
}
