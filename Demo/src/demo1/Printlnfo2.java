package demo1;

//������˼���������   �Ա�  ����  ���Է���
//ͨ���û����ļ���¼�룬�������������
import java.util.*;

public class Printlnfo2 {
	public static void main(String[] args) {

		//��Ҫ���û���һ��ͨ������¼��������� input
		Scanner input = new Scanner(System.in);
		
		//ʹ��input����ַ���
		System.out.print("������������");
		String name = input.next();
		
		System.out.print("�������Ա�");
		String sex = input.next();
		
		System.out.print("���������䣺");
		int age = input.nextInt();
		double score = 98.5;
		
		System.out.println("������"+name);
		System.out.println("�Ա�"+sex);
		System.out.println("���䣺"+age);
		System.out.println("���Է���"+score);
		
		
		
		
	}

}
