package demo1;

import java.util.Scanner;

public class Base {

	public static void main(String[] args) {
		System.out.print("�����빺���ˮ��������");
		Scanner sy= new Scanner(System.in);
		double v1 = sy.nextInt();
		double sum1 = v1 * 5;
		System.out.print("�����빺���ʳƷ������");
		double v2 = sy.nextInt();
		double sum2 =v2 * 8;
		double ss = sum1 + sum2;
		System.out.print("------" + ss);

	}

}
