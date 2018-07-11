package demo2;

import java.util.Scanner;

public class ScoreDemo {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("请输入数学分数");
	double shuxue = input.nextDouble();
	
	Scanner fenshu = new Scanner(System.in);
	System.out.println("请输入语文分数");
	double yuwen = fenshu.nextDouble();
	
	if (shuxue>=80 && yuwen>=80) {
		System.out.println("优秀");
	}else if(shuxue>=70 ||yuwen>=70 ) {
		System.out.println("良好");
	}else if(shuxue<60) {
		System.out.println("不及格");
	}
	
}
}
