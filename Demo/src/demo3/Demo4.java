package demo3;

import java.util.*;

//计算30人的平均分，使用数组实现
//数组长度：数组名字 .length
public class Demo4 {
	public static void main(String[] args) {

		// double[] scores = new double[3];
		// Scanner input =new Scanner(System.in);
		// //记录总分
		// double sum = 0;
		//
		// for(int i=0;i<scores.length;i++) {
		// System.out.println("请输入第"+(i+1)+"个同学的成绩：");
		// //为数组的30给格子赋值
		// scores[i] = input.nextDouble();
		// sum += scores[i];
		// }
		// //计算平均分
		// double avg = scores.length;
		// System.out.println("班级学员的平均分是："+avg);
		//

		
		
		
		double[] scores = new double[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个同学的成绩：");
			scores[i] = input.nextDouble();
		}

		double max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("最高分是：" + max);
	}
}
