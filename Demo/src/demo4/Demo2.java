package demo4;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		De cu = new De();
		System.out.println("�������һ��ֵ");
		cu.a = input.nextInt();
		System.out.println("������ڶ���ֵ");
		cu.b = input.nextInt();
		int result = cu.add1();
		System.out.println("��������ӵĽ���ǣ�" + result);
		cu.add();
	}

}

class De {
	int a;
	int b;

	public int add() {
		return a + b;
	}

	public int add1() {
		return a - b;
	}

	public int add2() {
		return a * b;
	}

	public int add3() {
		return a / b;
	}
}