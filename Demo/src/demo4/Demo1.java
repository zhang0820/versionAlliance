package demo4;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cell d1 = new Cell();
		
		
		
		
		
		// Dian d2 = new Dian();
		// System.out.println("������java�ɼ���");
		// d2.java = input.nextDouble();
		// System.out.println("������C�ɼ���");
		// d2.C = input.nextDouble();
		// System.out.println("������DB�ɼ���");
		// d2.DB = input.nextDouble();
		// double num = d2.C + d2.DB + d2.java;
		// System.out.println("�ܳɼ��ǣ�" + num);
		// double avg = num / 3;
		// System.out.println("ƽ���ɼ��ǣ�" + avg);
	}
}

// ���
class Cell {
	String pinpai;

	public void pub() {
		System.out.println("����");
	}

}

class Dian {
	double java;
	double C;
	double DB;
}
