package demo3;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		double qian = 5000;
		Scanner input = new Scanner(System.in);
		System.out.println("�����������ε��·ݣ�");
		int yue = input.nextInt();
		switch (yue) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("��������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
			int cang = input.nextInt();
			switch (cang) {
			case 1:
				qian = qian * 0.9;
				System.out.println("����Ʊ���ǣ�" + qian);
				break;
			case 2:
				qian = qian * 0.6;
				System.out.println("����Ʊ���ǣ�" + qian);
				break;
			default:
				System.out.println("��������ȷ����");
				break;
			}
		case 1:
		case 2:
		case 3:
		case 11:
		case 12:
			System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ� ͷ�Ȳ�����1�����ò�����2");
			cang = input.nextInt();
			switch (cang) {
			case 1:
				qian = qian * 0.5;
				System.out.println("����Ʊ���ǣ�" + qian);
				break;
			case 2:
				qian = qian * 0.4;
				System.out.println("����Ʊ���ǣ�" + qian);
				break;
			default:
				System.out.println("��������ȷ���֣�");
				break;
				}
			default: 
//					System.out.println("��������ȷ����");
					break;
		
		}
		

	}
}
