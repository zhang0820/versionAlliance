package demo3;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		System.out.println("MyShopping����ϵͳ���ͻ���Ϣ������ӿͻ���Ϣ\n");
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
		System.out.print("�������Ա����(4λ��)��");
		int ka = input.nextInt();
		System.out.print("�������Ա����(��/��)��");
		String sheng = input.next();
		System.out.print("�������Ա���֣�");
		int fen = input.nextInt();
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
		System.out.println(ka+"\t"+sheng+"\t"+fen);
		System.out.println();
		}
		System.out.println("�������");
	} 
		
}
