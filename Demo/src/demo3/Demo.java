package demo3;

import java.util.Random;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		// Scanner input = new Scanner(System.in);
		// System.out.println("������һ����Ա����");
		// int no = input.nextInt();
		//
		// int geWei = no % 10;
		// int shiWei = no / 10 % 10;
		// int baiWei = no / 100 % 10;
		// int qianWei = no / 1000;
		//
		// int sum = geWei + shiWei + baiWei + qianWei;
		//
		// System.out.println("��Ա����" + no + "��λ�к��ǣ�" + sum);
		// boolean shu = sum > 20;
		// System.out.println("�Ƿ������û���" + shu);

		// Random rd =new Random();
		// System.out.println(rd.nextInt(14)+4);
		//
		//
		// System.out.println((int)(Math.random()*13));

		// Random shu = new Random();
		// int a = shu.nextInt(10);
		// Scanner input = new Scanner(System.in);
		// System.out.println("�������Ա����");
		// int no = input.nextInt();
		// int Wei = no / 100 % 10;
		// System.out.println("�������ع������ϵͳ>\t���˳齱");
		// System.out.println();
		// if (Wei == a) {
		// System.out.println(no + "�ſͻ������˿ͻ������MP3һ��");
		//
		// } else {
		// System.out.println(no + "�ſͻ���лл����֧��");
		// }

		
		
		//�žų˷���
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
		
		
		// Scanner input = new Scanner(System.in);
		// System.out.println("���������Ա��(<��λ����>)��");
		// int hy =input.nextInt();
		// if(hy<10000&&hy>999) {
		// System.out.println("��������");
		// }else {
		// System.out.println("����");
		// }
		// System.out.println("�������Ա����(��/��<����λ����ʾ>)��");
		// String sr =input.next();
		// System.out.println("���������Ա����");
		// int jf =input.nextInt();
		// System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
		// System.out.println(+hy+"\t"+sr+"\t"+jf);

		// Scanner input = new Scanner(System.in);
		// System.out.println("���뿼�Գɼ���");
		// int score = input.nextInt();
		// if (score == 100) {
		// System.out.println("������");
		// } else if (score >= 90) {
		// System.out.println("���MP4");
		// } else if (score >= 60) {
		// System.out.println("�򱾲ο���");
		// } else {
		// System.out.println("ʲôҲû��");
		// }

		// Scanner input = new Scanner(System.in);
		// System.out.println("�����Ա���֣�");
		// int x = input.nextInt();
		// if(x<2000) {
		// System.out.println("9��");
		// }else if(x>=2000&&x<4000) {
		// System.out.println("8��");
		// }else if(x>=4000&&x<8000){
		// System.out.println("7��");
		// }else if (x>=8000) {
		// System.out.println("6��");
		// }

		// Scanner input = new Scanner(System.in);
		// System.out.println("���벦����룺");
		// int n = input.nextInt();
		// switch (n) {
		// case 1:
		// System.out.println("���ְֵĺ�");
		// break;
		// case 2:
		// System.out.println("������ĺ�");
		// break;
		// case 3:
		// System.out.println("��үү�ĺ�");
		// break;
		// case 4:
		// System.out.println("�����̵ĺ�");
		// break;

		// }

		 Scanner input = new Scanner(System.in);
		 System.out.println("�������ѽ�");
		 int shu = input.nextInt();
		 System.out.println("�Ƿ�μ��Żݼӹ����");
		 System.out.println("1.��50Ԫ����2Ԫ�������¿���1ƿ");
		 System.out.println("2.��100Ԫ����3Ԫ����500ml����һƿ");
		 System.out.println("3.��100Ԫ����10Ԫ��5�����");
		 System.out.println("4.��200Ԫ����10Ԫ����1���ղ�������");
		 System.out.println("5.��200Ԫ����20Ԫ����ŷ����ˬ��ˮ1ƿ");
		 System.out.println("0.������");
		 System.out.println("��ѡ��");
		 int shu1 = input.nextInt();
		
		 switch (shu1) {
		 case 1:
		 if (shu > 50) {
		 shu = shu + 2;
		 System.out.println("���������ܽ�" + shu);
		 System.out.println("�ɹ����������¿���1ƿ");
		 } else {
		 System.out.println("�����ѽ��С��50����������ӹ��");
		 }
		 break;
		 case 2:
		 if (shu > 100) {
		 shu = shu + 3;
		 System.out.println("���������ܽ�" + shu);
		 System.out.println("�ɹ�������500ml����һƿ");
		 } else {
		 System.out.println("�����ѽ��С��100����������ӹ��");
		 }
		 break;
		 case 3:
		 if (shu > 100) {
		 shu = shu + 10;
		 System.out.println("���������ܽ�" + shu);
		 System.out.println("�ɹ�������5�����");
		 } else {
		 System.out.println("�����ѽ��С��100����������ӹ��");
		 }
		 break;
		 case 4:
		 if (shu > 200) {
		 shu = shu + 10;
		 System.out.println("���������ܽ�" + shu);
		 System.out.println("�ɹ�������һ���ղ�������");
		 } else {
		 System.out.println("�����ѽ��С��200����������ӹ��");
		 }
		 break;
		 case 5:
		 if (shu > 200) {
		 shu = shu + 20;
		 System.out.println("���������ܽ�" + shu);
		 System.out.println("�ɹ�������ŷ����ˬ��ˮ1ƿ");
		 } else {
		 System.out.println("�����ѽ��С��200����������ӹ��");
		 }
		 break;
		 default:
		 System.out.println("��ӭ�´ι���");
		 }

	}

}
