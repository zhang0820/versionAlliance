package demo3;

import java.util.*;

//����30�˵�ƽ���֣�ʹ������ʵ��
//���鳤�ȣ��������� .length
public class Demo4 {
	public static void main(String[] args) {

		// double[] scores = new double[3];
		// Scanner input =new Scanner(System.in);
		// //��¼�ܷ�
		// double sum = 0;
		//
		// for(int i=0;i<scores.length;i++) {
		// System.out.println("�������"+(i+1)+"��ͬѧ�ĳɼ���");
		// //Ϊ�����30�����Ӹ�ֵ
		// scores[i] = input.nextDouble();
		// sum += scores[i];
		// }
		// //����ƽ����
		// double avg = scores.length;
		// System.out.println("�༶ѧԱ��ƽ�����ǣ�"+avg);
		//

		
		
		
		double[] scores = new double[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < scores.length; i++) {
			System.out.println("�������" + (i + 1) + "��ͬѧ�ĳɼ���");
			scores[i] = input.nextDouble();
		}

		double max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("��߷��ǣ�" + max);
	}
}
