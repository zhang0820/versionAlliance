package demo1;

//输出个人简历；姓名   性别  年龄  考试分数
//通过用户灵活的键盘录入，让数据灵活起来
import java.util.*;

public class Printlnfo2 {
	public static void main(String[] args) {

		//需要给用户开一个通过键盘录入程序的入口 input
		Scanner input = new Scanner(System.in);
		
		//使用input获得字符串
		System.out.print("请输入姓名：");
		String name = input.next();
		
		System.out.print("请输入性别：");
		String sex = input.next();
		
		System.out.print("请输入年龄：");
		int age = input.nextInt();
		double score = 98.5;
		
		System.out.println("姓名："+name);
		System.out.println("性别："+sex);
		System.out.println("年龄："+age);
		System.out.println("考试分数"+score);
		
		
		
		
	}

}
