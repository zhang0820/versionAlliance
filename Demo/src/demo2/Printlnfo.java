package demo2;
//输出个人简历：姓名   性别 年龄  考试分数
public class Printlnfo {

		public static void main(String[] args){
		//使用变量来储存个人信息
		//（1）判断变量类型：姓名Strint   年龄int     性别char     考试分数 
		//float    doible
		//（2）给变量取名：姓名Strint   name  年龄int  age  性别char  sex   考试分数 
		//float   float  	score           
		//（3）使用变量  数据类型 变量名 = 值 ；
		
		String name="张三";
		char sex='男';
		int age=25;
		float score=98.5f;


		System.out.println("姓名："+name);
		System.out.println("性别："+sex);	
		System.out.println("年龄："+age);
		System.out.println("考试分数："+score);

		}
	}

