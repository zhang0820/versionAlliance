package demo1;

import java.util.Scanner;

public class Gong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in1 = sc.nextInt();
		System.out.println(in1);
		switch (in1) {
		case 1:
			System.out.println("�����Ͽ�");
			break;
		case 2:
			System.out.println("������ɽ");
			break;
		case 3:
			System.out.println("������ϰ");
			break;
		default:
			System.out.println("����˯��");

		}
		sc.close();

	}

}
