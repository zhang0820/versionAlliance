package demo2;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		//�������ͷ���Ƕ�1:
		//��ֵ������int   ����float��double��
		//����ֵ���ַ���String  �ַ�char ������ boolean��true/false����
		//����Ƕ�2��Ӧ����������String	�����������ͣ�int  float  double  char  boolean
		
		//������ֵĬ������������double
//		int num1 = 10;
//		double num2 = 9.8;
//		float num3 = 5.6f;
		
		//�����ʽ����һ��ֵΪdoubleʱ�����������Ϊdouble
		//ǿ������ת����double->int������  ����ɾ��ȶ�ʧ
//		int num4 = num1-(int)num2;
//		System.out.println(num4);
		
		//�Զ�����ת��  int->double
//		num2 = 100;
		
		
		
		
		
//		int num1 = 5;
//		int num2 = 2;
//		int a = num1%num2;
//		int b = num1/num2;
//		System.out.println(num1+"%"+num2+"="+a);
//		System.out.println(num1+"/"+num2+"="+b);
//		num1++;
//		num2--;
//		System.out.println("num1="+num1);
//		System.out.println("num2="+num2);
		
		
		
		Scanner input = new Scanner(System.in); 
		System.out.print("������һ����...");
		int num = input.nextInt();
	 	String resurl = (num%4==0)?"����":"ƽ��";
		System.out.println(num+"��"+resurl);
		
		
	}

}
