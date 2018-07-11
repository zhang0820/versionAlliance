package version;

import java.lang.Thread.State;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Version2 {

	// �����
	static User[] users = new User[5];
	static Food[] foods = new Food[5];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Food f1 = new Food();
		f1.foodId = 1;
		f1.foodName = "������˿";
		f1.price = 18.0;
		f1.praise = 0;
		foods[0] = f1;

		Food f2 = new Food();
		f2.foodId = 2;
		f2.foodName = "���մ���";
		f2.price = 32.0;
		f2.praise = 0;
		foods[1] = f2;

		Food f3 = new Food();
		f3.foodId = 3;
		f3.foodName = "ʱ������";
		f3.price = 13.0;
		f3.praise = 0;
		foods[2] = f3;

		Food f4 = new Food();
		f4.foodId = 4;
		f4.foodName = "��������";
		f4.price = 16.0;
		f4.praise = 0;
		foods[3] = f4;

		Food f5 = new Food();
		f5.foodId = 5;
		f5.foodName = "ˮ��ɳ��";
		f5.price = 10.0;
		f5.praise = 0;
		foods[4] = f5;

		int fan = 0;
		do {

			// ��������˵�
			menu();

			// �������룬�ж��û�����,����0����
			int shu = input.nextInt();

			switch (shu) {
			case 1:
				System.out.println("*****��Ҫ����*****");

				int temp = -1;
				// �ж�������û��λ��
				for (int i = 0; i < users.length; i++) {
					if (users[i] == null) {

						temp = i;
						break;
					}
				}

				if (temp == -1) {
					System.out.println("��������");
					break;
				}

				// ����һ���µ��û�
				User u = new User();
				u.food = new Food();
				// ���

				// ��ʾ�˵�
				recipe();

				// ���� ���û������������ֻ��ţ���Ʒ��ţ��������Ͳ�ʱ�䣬�Ͳ͵�ַ
				System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
				u.food.foodId = input.nextInt();
				if (u.food.foodId >= 1 && u.food.foodId <= 5) {
					System.out.print("��ѡ������Ҫ�ķ�����");
					u.food.number = input.nextInt();
				} else {
					System.out.println("�Բ���û����Ҫ�Ĳˣ����������룺");
					break;
				}
				System.out.print("�����붩��������");
				u.name = input.next();
				System.out.print("�������ֻ��ţ�");
				u.phone = input.next();
				System.out.print("�������Ͳ�ʱ�䣺");
				u.time = input.next();
				System.out.print("�������Ͳ͵�ַ��");
				u.address = input.next();

				u.food.foodName = foods[u.food.foodId - 1].foodName;
				u.food.foodId = foods[u.food.foodId - 1].foodId;
				u.food.price = foods[u.food.foodId - 1].price;
				System.out.println("���ͳɹ�");
				System.out.println("�������ǣ�" + foods[u.food.foodId - 1].foodName + u.food.number + "��");
				System.out.println("�Ͳ�ʱ���ǣ�" + u.time);
				u.unmFood = foods[u.food.foodId - 1].price * u.food.number;
				// �ж� ������50Ԫ ��6Ԫ���ͷ� �����6Ԫ���ͷ�

				double num1 = 6;
				if (u.unmFood <= 50) {
					u.unmFood += 6;
				} else {
					num1 = 0;
				}

				System.out.println("�ͷ��ܼ۸��ǣ�" + (u.unmFood) + "Ԫ" + "   ���ͷѣ�" + num1 + "Ԫ");
				System.out.println("�绰�ţ�" + u.phone);
				System.out.println("��ַ�ǣ�" + u.address);
				users[temp] = u;
				break;
			case 2:
				System.out.println("*****�鿴�ʹ�*****");
				// �鿴�ʹ�
				view();
				break;
			case 3:
				System.out.println("*****ǩ�ն���*****");
				// ǩ�ն���
				view();
				System.out.println("��ѡ��Ҫǩ���Ķ�����ţ�");
				int id = input.nextInt();
				boolean isFind = false;
				// ״̬Ϊ��Ԥ�������Ϊ�û�����Ķ�����1����ǩ��
				// ״̬Ϊ����ɣ����Ϊ�û�����Ķ�����ż�1�� ����ǩ��
				for (int i = 0; i < users.length; i++) {
					if (users[i] != null && users[i].state == 0 && id == i + 1) {
						users[i].state = 1;
						System.out.println("ǩ�ճɹ�");
						isFind = true;
					} else if (users[i] != null && users[i].state == 1 && id == i + 1) {
						System.out.println("�Բ�����ѡ��Ķ����Ѿ����ǩ�գ�������ǩ��");
						isFind = true;
					}
				}
				if (!isFind) {
					System.out.println("�Բ���û�д˶�����");
				}
				break;
			case 4:
				System.out.println("*****ɾ������*****");

				// ɾ������

				view();

				System.out.println("����ѡ��Ҫɾ���Ķ�����ţ�");
				int uid = input.nextInt();
				boolean pp = false;
				// ��Ҫ�ж���ǩ�յĿ���ɾ������δǩ�յĲ���ɾ��
				for (int i = 0; i < users.length; i++) {

					if (users[uid - 1] != null && users[i].state == 0) {
						System.out.println("δ��ɣ�����ɾ��");
						pp = false;
						break;
					} else if (users[uid - 1] != null && users[i].state == 1) {
						users[uid - 1] = null;
						System.out.println("ɾ���ɹ�");
						pp = true;
						break;
					}
				}
				if (users[uid - 1] == null && pp == false)
					System.out.println("�Բ���û�д˶�����");
				break;

			case 5:
				System.out.println("*****��Ҫ����*****");
				// Ҫ�����
				recipe();
				System.out.print("����ѡ��Ҫ���޵Ĳ�Ʒ��ţ�");
				int xu = input.nextInt();
				if (xu >= 1 && xu <= 5) {
					foods[xu - 1].praise += 1;
					System.out.println("���޳ɹ���");
				} else {
					System.out.println("�������");
					break;
				}
				break;
			case 6:
				System.out.println("ллʹ�ã���ӭ�´ι��٣�");
				System.exit(0);
				break;
			default:
				System.out.println("������������������");
				continue;
			}

			System.out.print("����0�˳�����������������ֵ����");
			fan = input.nextInt();

		} while (fan != 0);
		System.out.println("ллʹ�ã���ӭ�´ι��٣�");

	}

	// ����һ��ִ�в˵�����
	public static void menu() {

		System.out.println("��������������������ӭʹ�á��Ի����˶���ϵͳ����������������������\n");
		System.out.println("************************");
		System.out.println("1.��Ҫ����");
		System.out.println("2.�鿴�ʹ�");
		System.out.println("3.ǩ�ն���");
		System.out.println("4.ɾ������");
		System.out.println("5.��Ҫ����");
		System.out.println("6.�˳�ϵͳ");
		System.out.println("************************");
		System.out.print("��ѡ��");
	}

	// ����һ���˵�����
	public static void recipe() {
		for (Food food : foods) {
			System.out.println(
					"��ţ�" + food.foodId + "\t���ƣ�" + food.foodName + "\t�۸�" + food.price + "\t������" + food.praise);

		}
	}

	// �鿴�ʹ�
	public static void view() {
		System.out.println("���\t������\t��Ʒ����\t\t�Ͳ�ʱ��\t\t�Ͳ͵�ַ\t\t�ܽ��\t\t����״̬");
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null)
				break;
			System.out.println((i + 1) + "\t" + users[i].name + "\t" + users[i].food.foodName + "\t\t" + users[i].time
					+ "\t\t" + users[i].address + "\t\t" + users[i].unmFood + "Ԫ\t\t"
					+ ((users[i].state == 0 ? "δ���" : "�����")));

		}
	}
}

// �û���
 class User {
	String name;// ����
	String phone;// �ֻ���
	String time;// �Ͳ�ʱ��
	String address;// ��ַ
	double unmFood;// �ܼ۸�
	Food food;// �µ��û�
	int state = 0;// ����״̬
}

// ����
class Food {
	int foodId;// ���
	String foodName; // ��Ʒ����
	int number;// ����
	double price;// ����
	int praise;// ��

}