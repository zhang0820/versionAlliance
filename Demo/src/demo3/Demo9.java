package demo3;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ��MyShopping����ϵͳ");
		System.out.println("");
		System.out.println("*************************************");
		System.out.println("\t1.�ͻ���Ϣ����");
		System.out.println("\t2.�������");
		System.out.println("\t3.����ع�");
		System.out.println("\t4.ע��");
		System.out.println("*************************************");
		System.out.println("");
		System.out.print("��ѡ���������֣�");
		int shu = input.nextInt();
		boolean fao=true;
		do {
		switch(shu) {
		case 1:
			System.out.println("�ͻ���Ϣ����");
			fao=false;
			break;
		case 2:
			System.out.println("�������");
			fao=false;
			break;
		case 3:
			System.out.println("����ع�");
			fao=false;
			break;
		case 4:
			System.out.println("ע��");
			fao=false;
			break;
		default:
			System.out.print("�����������������:");
			shu = input.nextInt();
			break;
		}
		}while(fao);
		System.out.println("�������");
	}

}
