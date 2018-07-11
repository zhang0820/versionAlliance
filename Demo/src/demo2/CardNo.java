package demo2;

import java.util.Scanner;

public class CardNo {
public static void main(String[] args) {
	//输入一个四位会员卡号，控制台计算会员卡号的各位数，并计算各数之和
	Scanner input = new Scanner(System.in);
	System.out.println("请输入一个会员卡号");
	int no = input.nextInt();
	
	System.out.println("会员卡号是："+no);
	
	int geWei = no%10;
	int shiWei = no/10%10;
	int baiWei = no/100%10;
	int qianWei = no/1000;
	System.out.println("会员卡号个位数："+geWei+"；十位数："+shiWei+"；百位数："+baiWei+"；千位数："+qianWei);
	
	int sum = geWei+shiWei+baiWei+qianWei;
	
	System.out.println("会员卡和为："+sum);
	String shu = (sum<20)?"恭喜您没中奖。。。":"恭喜您中奖了！奖品是MP3！";
	System.out.println("尊敬的卡号"+no+"会员"+shu);
	
		}
}
