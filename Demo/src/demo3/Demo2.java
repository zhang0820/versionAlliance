package demo3;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] arge) {
		// �̳�Ա������
		// Scanner input = new Scanner(System.in);
		// System.out.println("������������ʣ�");
		// double jibe = input.nextDouble();
		// double wujia = jibe*0.4;
		// double fang = jibe*0.25;
		// double xin = jibe+wujia+fang;
		// System.out.println("��Ա���Ĺ���ϸĿΪ��");
		// System.out.println("��������Ϊ��"+jibe);
		// System.out.println("��۽���Ϊ��"+wujia);
		// System.out.println("��������ǣ�"+fang);
		// System.out.println("Ա��нˮ�ǣ�"+xin);
		//

		
		
		
		// ����������ֵ����
		// int hei = 10,hon = 8;
		// System.out.println("���ǰ�����е�ֽ�ƣ�");
		// System.out.println("�����е�ֽ�ƣ�"+hei);
		// System.out.println("�����е�ֽ�ƣ�"+hon);
		// int a = hei;
		// hei = hon;
		// hon = a;
		// System.out.println("���������е�ֽ�ƣ�");
		// System.out.println("�����е�ֽ�ƣ�"+hei);
		// System.out.println("�����е�ֽ�ƣ�"+hon);
		// //ֱ�����
		// int hei = 10,hon = 8;
		// System.out.println("�����е�ֽ�ƣ�"+hon+"\n�����е�ֽ�ƣ�"+hei);

		
		
		
		
		// ������Ϣ����
		 Scanner input = new Scanner(System.in);
		 System.out.println("�����뱾��");
		 double benjin = input.nextDouble();
		 double yi = 0.0225,er = 0.027,san = 0.0324,si = 0.036;
		 int yi1 = 1,er1 = 2, san1 = 3,si1 = 5;
		 double yi2=benjin*yi*yi1,er2=benjin*er*er1;
		 double san2=benjin*san*san1,si2=benjin*si*si1;
		 System.out.println("����Ϊ��"+benjin);
		 System.out.println();
		 System.out.println("��ȡһ���ı�Ϣ�ǣ�"+(yi2+benjin));
		 System.out.println();
		 System.out.println("��ȡ�����ı�Ϣ�ǣ�"+(er2+benjin));
		 System.out.println();
		 System.out.println("��ȡ�����ı�Ϣ�ǣ�"+(san2+benjin));
		 System.out.println();
		 System.out.println("��ȡ�����ı�Ϣ�ǣ�"+(si2+benjin));
		

	}
}
