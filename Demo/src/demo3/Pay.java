package demo3;

import java.util.Scanner;

public class Pay {
	public static void main(String[] args) {
		
		int tx = 245;
		int wqx = 570;
		int wqp = 320;
		int tx1 = 2;
		int wqx1 = 1;
		int wqp1 = 1;
		double zk = 0.8;
		Scanner input=new Scanner(System.in);
		System.out.println("* * * * * * * * * * *  ���ѵ� * * * * * * * * * * * * ");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��"+"\t"+"��245"+"\t"+"2"+"\t"+"��490");
		System.out.println("����Ь"+"\t"+"��570"+"\t"+"1"+"\t"+"��570");
		System.out.println("������"+"\t"+"��320"+"\t"+"1"+"\t"+"��320");
		System.out.println();
		System.out.println("�ۿ�"+"\t"+"8��");
		double zong = (tx*tx1+wqp*wqp1+wqx*wqx1)*0.8;
		System.out.println("�����ܽ��"+"��"+zong);
		System.out.println("ʵ�ʽ��ѣ�");
		double a = input.nextDouble();
		System.out.println("��Ǯ"+(a-zong));
		double jf =(int)zong*3/100;
		System.out.println("���ι������л�û�����"+jf);
		
	}

}
