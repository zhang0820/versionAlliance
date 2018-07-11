package demo1;

import java.util.Scanner;

public class Iang {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int in1 = sc.nextInt();
		System.out.println(in1);
		if (in1 == 1) {
			System.out.println("今天上课");
		}else if (in1 == 2) {
			System.out.println("今天爬山");
		}else if (in1 == 3) {
			System.out.println("今天休息");
		}else {
			System.out.println("今天睡觉");
		}
		sc.close();
		
      
	}

}
