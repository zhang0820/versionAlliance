package demo3;
//�������

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		String name = ""; // ��Ʒ����
		double price = 0.0; // ��Ʒ�۸�
		int goodsNo = 0; // ��Ʒ���
		int amount = 0; // ��������
		double discount = 0.8; // �ۿ۱���
		double total = 0.0; // ��Ʒ�ܼ�
		double payment = 0.0; // ʵ�����

		// ��Ʒ�嵥
		System.out.println("*******************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T ��        2.����Ь        3.������");
		System.out.println("*******************************************");

		Scanner input = new Scanner(System.in);
		String answer = "y"; // ��ʶ�Ƿ����

		while ("y".equals(answer)) {
			System.out.print("\n��������Ʒ��ţ�");
			goodsNo = input.nextInt();
			switch (goodsNo) {
			case 1:
				name = "T ��";
				price = 245;
				break;
			case 2:
				name = "����Ь";
				price = 899;
				break;
			case 3:
				name = "������";
				price = 320;
				break;
			}
			System.out.print("�����빺��������");
			amount = input.nextInt();
			System.out.println(name + "��" + price + "\t���� " + amount + "\t�ϼ� ��" + price * amount);
			total += price * amount;
			System.out.print("�Ƿ������y/n��");
			answer = input.next();
		}
		System.out.println("\n�ۿۣ�" + discount);
		System.out.println("Ӧ����" + total * discount);
		System.out.print("ʵ����");
		payment = input.nextDouble();
		while (payment - total * discount < 0) {
			System.out.print("������Ľ��С��Ӧ�������������룺");
			payment = input.nextDouble();
		}
		System.out.println("��Ǯ��" + (payment - total * discount));
	}
	
//	
//	double c=0;
//	int i=0;
//	double f;
//	do{
//	f=c*9/5+32;
//	System.out.println("�����¶�:"+c+"��,�����¶�:"+f+"��");
//	c+=20;
//	i++;
//	}while(i<=10&&c<=250);

//}
}