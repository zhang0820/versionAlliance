package demo2;

import java.util.Scanner;

public class Shu {
	public static void main(String[] args) {
		// �ܽ�10�������������˾��������Ա���з���
		Scanner input = new Scanner(System.in);
		System.out.print("�����������ܲ��ɼ���");
		int time = input.nextInt();
		System.out.print("�����������Ա�(��/Ů)��");
		String sex = input.next();
		if (time < 10) {
			if (sex.equals("��")) {
				System.out.print("�����������������");
			} else if (sex.equals("Ů")) {
				System.out.print("��������Ů�������");
			} else {
				System.out.print("�Բ��������Ա𲻷��ϲ���Ҫ��");
			}
		} else {
			System.out.print("�Բ��𣬳ɼ����ϸ񣬽����˾���");
		}
	}

}
