package demo2;

import java.util.Scanner;

public class ScoreDemo {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("��������ѧ����");
	double shuxue = input.nextDouble();
	
	Scanner fenshu = new Scanner(System.in);
	System.out.println("���������ķ���");
	double yuwen = fenshu.nextDouble();
	
	if (shuxue>=80 && yuwen>=80) {
		System.out.println("����");
	}else if(shuxue>=70 ||yuwen>=70 ) {
		System.out.println("����");
	}else if(shuxue<60) {
		System.out.println("������");
	}
	
}
}
