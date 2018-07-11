package demo3;

import java.util.Random;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		// Scanner input = new Scanner(System.in);
		// System.out.println("请输入一个会员卡号");
		// int no = input.nextInt();
		//
		// int geWei = no % 10;
		// int shiWei = no / 10 % 10;
		// int baiWei = no / 100 % 10;
		// int qianWei = no / 1000;
		//
		// int sum = geWei + shiWei + baiWei + qianWei;
		//
		// System.out.println("会员卡号" + no + "各位中和是：" + sum);
		// boolean shu = sum > 20;
		// System.out.println("是否幸运用户吗？" + shu);

		// Random rd =new Random();
		// System.out.println(rd.nextInt(14)+4);
		//
		//
		// System.out.println((int)(Math.random()*13));

		// Random shu = new Random();
		// int a = shu.nextInt(10);
		// Scanner input = new Scanner(System.in);
		// System.out.println("请输入会员卡号");
		// int no = input.nextInt();
		// int Wei = no / 100 % 10;
		// System.out.println("我行我素购物管理系统>\t幸运抽奖");
		// System.out.println();
		// if (Wei == a) {
		// System.out.println(no + "号客户是幸运客户，获得MP3一个");
		//
		// } else {
		// System.out.println(no + "号客户，谢谢您的支持");
		// }

		
		
		//九九乘法表
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
		
		
		// Scanner input = new Scanner(System.in);
		// System.out.println("请您输入会员号(<四位整数>)：");
		// int hy =input.nextInt();
		// if(hy<10000&&hy>999) {
		// System.out.println("继续输入");
		// }else {
		// System.out.println("错误");
		// }
		// System.out.println("请输入会员生日(月/日<用两位数表示>)：");
		// String sr =input.next();
		// System.out.println("请您输入会员积分");
		// int jf =input.nextInt();
		// System.out.println("已录入的会员信息是：");
		// System.out.println(+hy+"\t"+sr+"\t"+jf);

		// Scanner input = new Scanner(System.in);
		// System.out.println("输入考试成绩：");
		// int score = input.nextInt();
		// if (score == 100) {
		// System.out.println("买辆车");
		// } else if (score >= 90) {
		// System.out.println("买个MP4");
		// } else if (score >= 60) {
		// System.out.println("买本参考书");
		// } else {
		// System.out.println("什么也没有");
		// }

		// Scanner input = new Scanner(System.in);
		// System.out.println("输入会员积分：");
		// int x = input.nextInt();
		// if(x<2000) {
		// System.out.println("9折");
		// }else if(x>=2000&&x<4000) {
		// System.out.println("8折");
		// }else if(x>=4000&&x<8000){
		// System.out.println("7折");
		// }else if (x>=8000) {
		// System.out.println("6折");
		// }

		// Scanner input = new Scanner(System.in);
		// System.out.println("输入拨打号码：");
		// int n = input.nextInt();
		// switch (n) {
		// case 1:
		// System.out.println("拨爸爸的号");
		// break;
		// case 2:
		// System.out.println("拨妈妈的号");
		// break;
		// case 3:
		// System.out.println("拨爷爷的号");
		// break;
		// case 4:
		// System.out.println("拨奶奶的号");
		// break;

		// }

		 Scanner input = new Scanner(System.in);
		 System.out.println("输入消费金额：");
		 int shu = input.nextInt();
		 System.out.println("是否参加优惠加购活动：");
		 System.out.println("1.满50元，加2元换购百事可乐1瓶");
		 System.out.println("2.满100元，加3元换购500ml可乐一瓶");
		 System.out.println("3.满100元，加10元换5斤面粉");
		 System.out.println("4.满200元，加10元换购1个苏泊尔炒锅");
		 System.out.println("5.满200元，加20元换购欧莱雅爽肤水1瓶");
		 System.out.println("0.不换购");
		 System.out.println("请选择：");
		 int shu1 = input.nextInt();
		
		 switch (shu1) {
		 case 1:
		 if (shu > 50) {
		 shu = shu + 2;
		 System.out.println("本次消费总金额：" + shu);
		 System.out.println("成功换购：百事可乐1瓶");
		 } else {
		 System.out.println("您消费金额小于50，不能满足加购活动");
		 }
		 break;
		 case 2:
		 if (shu > 100) {
		 shu = shu + 3;
		 System.out.println("本次消费总金额：" + shu);
		 System.out.println("成功换购：500ml可乐一瓶");
		 } else {
		 System.out.println("您消费金额小于100，不能满足加购活动");
		 }
		 break;
		 case 3:
		 if (shu > 100) {
		 shu = shu + 10;
		 System.out.println("本次消费总金额：" + shu);
		 System.out.println("成功换购：5斤面粉");
		 } else {
		 System.out.println("您消费金额小于100，不能满足加购活动");
		 }
		 break;
		 case 4:
		 if (shu > 200) {
		 shu = shu + 10;
		 System.out.println("本次消费总金额：" + shu);
		 System.out.println("成功换购：一个苏泊尔炒锅");
		 } else {
		 System.out.println("您消费金额小于200，不能满足加购活动");
		 }
		 break;
		 case 5:
		 if (shu > 200) {
		 shu = shu + 20;
		 System.out.println("本次消费总金额：" + shu);
		 System.out.println("成功换购：欧莱雅爽肤水1瓶");
		 } else {
		 System.out.println("您消费金额小于200，不能满足加购活动");
		 }
		 break;
		 default:
		 System.out.println("欢迎下次光临");
		 }

	}

}
