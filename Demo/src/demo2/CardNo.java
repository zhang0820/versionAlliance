package demo2;

import java.util.Scanner;

public class CardNo {
public static void main(String[] args) {
	//����һ����λ��Ա���ţ�����̨�����Ա���ŵĸ�λ�������������֮��
	Scanner input = new Scanner(System.in);
	System.out.println("������һ����Ա����");
	int no = input.nextInt();
	
	System.out.println("��Ա�����ǣ�"+no);
	
	int geWei = no%10;
	int shiWei = no/10%10;
	int baiWei = no/100%10;
	int qianWei = no/1000;
	System.out.println("��Ա���Ÿ�λ����"+geWei+"��ʮλ����"+shiWei+"����λ����"+baiWei+"��ǧλ����"+qianWei);
	
	int sum = geWei+shiWei+baiWei+qianWei;
	
	System.out.println("��Ա����Ϊ��"+sum);
	String shu = (sum<20)?"��ϲ��û�н�������":"��ϲ���н��ˣ���Ʒ��MP3��";
	System.out.println("�𾴵Ŀ���"+no+"��Ա"+shu);
	
		}
}
