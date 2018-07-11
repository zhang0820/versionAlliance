package demo2;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		//数据类型分类角度1:
		//数值（整数int   浮点float、double）
		//非数值（字符串String  字符char 布尔型 boolean（true/false））
		//分类角度2：应用数据类型String	基本数据类型：int  float  double  char  boolean
		
		//浮点数值默认数据类型是double
//		int num1 = 10;
//		double num2 = 9.8;
//		float num3 = 5.6f;
		
		//当表达式中有一个值为double时，整个结果提为double
		//强制类型转换：double->int报错了  会造成精度丢失
//		int num4 = num1-(int)num2;
//		System.out.println(num4);
		
		//自动类型转换  int->double
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
		System.out.print("请输入一个数...");
		int num = input.nextInt();
	 	String resurl = (num%4==0)?"闰年":"平年";
		System.out.println(num+"是"+resurl);
		
		
	}

}
