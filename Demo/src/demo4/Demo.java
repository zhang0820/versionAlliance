package demo4;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		User  u1 = new User();
		u1.fen =1000;
		u1.ka = "��";
		Scanner input = new Scanner(System.in);
		System.out.println("��������֣�");
		int jifen = input.nextInt();
		System.out.println("�����뿨�ࣺ");
		String ka1 = input.next();
		if(jifen >= 5000) {
			System.out.println("���500����");
		}else if (jifen >= 1000 && u1.ka.equals(ka1)) {
			System.out.println("���500����");
		}else {
			System.out.println("��������");
		}
		
		
		
		
//		System.out.print("�������û�����");
//		String hym = input.next();
//		System.out.print("���������룺");
//		String mim = input.next();
//		if(u1.mm.equals(mim)&&u1.yong.equals(hym)) {
//			System.out.print("�����������룺");
//			String xing = input.next();
//			System.out.println("�޸ĳɹ�");
//		}else {
//			System.out.println("�û�����ƥ�䣡");
//		}
		
		
		
		
		
	}
}
class User{
	String yong = "zhang";
	String mm = "123456";
	
	String ka;
	int fen;
	
}

