package version;

//�Ի����˶���ϵͳ
//2018.7.7
//zhangrui

import java.text.BreakIterator;
import java.util.Scanner;

public class Version1 {

	public static void main(String[] args) {
		// һ�鶩��
		int choose = 0;
		String[] names = new String[4];// ���涩��������
		String[] dishMegs = new String[4];// ������Ʒ��Ϣ
		int[] times = new int[4];// �Ͳ�ʱ��
		String[] addresses = new String[4];// �Ͳ͵�ַ
		int[] states = new int[4];// �Ͳ�״̬
		double[] sumPrices = new double[4]; // �ܽ��
		Scanner input = new Scanner(System.in);
		// һ���Ʒ
		String[] dishNames = { "���մ���", "������˿", "ʱ���߲�" };
		double[] prices = { 38.0, 18.0, 10.0 };
		int[] praiseNums = new int[3];
		int num = -1; // �û�����0�������˵��������˳�ϵͳ
		do {
			System.out.println("����������������������ӭʹ�á��Ի����˶���ϵͳ��������������������");
			System.out.println("********************************\n");
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ǩ�ն���");
			System.out.println("4.ɾ������");
			System.out.println("5.��Ҫ����");
			System.out.println("6.���ϵͳ\n");
			System.out.println("********************************\n");
			System.out.print("��ѡ��");
			choose = input.nextInt();// ��¼�û�ѡ��Ĺ��ܱ��
			boolean isAdd = false; // Ture:��¼�ҵ�һ��Ϊ�յ�λ��,���Բ��� false:û���ҵ�
			// �����û�����Ĺ��ܱ�ţ�ִ����Ӧ�Ĺ���
			switch (choose) {
			case 1:
				// ����
				System.out.println("***��Ҫ����***");
				// ����Ҫ�����λ��
				for (int i = 0; i < names.length; i++) {
					if (names[i] == null) {
						isAdd = true; // ��¼���ҵ�һ��Ϊ�յ�λ��
						// ִ�в������
						// ��ʾ���пɹ�ѡ��Ĳ�Ʒ��Ϣ
						System.out.println("���\t��Ʒ��\t�۸�\t������");
						for (int j = 0; j < praiseNums.length; j++) {
							String price = prices[j] + "Ԫ";
							String praise = praiseNums[j] + "��";
							System.out.println(+(j + 1) + "\t" + dishNames[j] + "\t" + price + "\t" + praise);

						}
						// ������ѡ��Ʒ��ż�����
						System.out.print("��ѡ��������Ʒ��ţ�");
						int chooseDish = input.nextInt();

						// �������
						System.out.print("��ѡ������������");
						int number = input.nextInt();

						String dishMeg = dishNames[chooseDish - 1] + " " + number + "��";

						// ���붩��������
						System.out.print("�����붩����������");
						String name = input.next();

						// �����Ͳ�ʱ��
						System.out.print("�������Ͳ�ʱ��(10��~20����)��");
						int time = input.nextInt();

						// ������������������
						while (time < 10 || time > 20) {
							System.out.println("�Բ����������ʱ�䲻������ʱ����(10~20)");
							time = input.nextInt();
						}

						// �����Ͳ͵�ַ
						System.out.print("�������Ͳ͵�ַ��");
						String address = input.next();

						// ����ͷ�
						double sumPrice = prices[chooseDish - 1] * number;
						// �Ͳͷѣ����ͷѵ�50Ԫʱ ��6Ԫ�Ͳͷ�
						double deliCharge = sumPrice >= 50 ? 0.0 : 6.0;

						// ��ʾ������Ϣ
						System.out.println("���ͳɹ�");
						System.out.println("�������ǣ�" + dishMeg);
						System.out.println("�����ˣ�" + name);
						System.out.println("�Ͳ�ʱ�䣺" + time + "��");
						System.out.println("�Ͳ͵�ַ��" + address);
						System.out.println("�ͷѣ�" + sumPrice + "���Ͳͷѣ�" + deliCharge);
						System.out.println("�ܽ�" + (sumPrice + deliCharge) + "Ԫ");

						// ��������
						names[i] = name;
						dishMegs[i] = dishMeg;
						times[i] = time;
						addresses[i] = address;
						sumPrices[i] = sumPrice + deliCharge;

						break;
					}
				}
				// ���û���ҵ�����յ�λ�ã�����ʾ��Ϣ
				if (!isAdd) {
					System.out.println("�Բ������Ĳʹ�����");
				}
				break;
			case 2:
				// �鿴�ʹ�
				System.out.println("***�鿴�ʹ�***");
				System.out.println("���\t������\t������Ʒ��Ϣ\t�Ͳ�ʱ��\t\t�Ͳ͵�ַ\t\t�ܽ��\t\t״̬");
				// ��������
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String state = (states[i] == 0) ? "\t��Ԥ��" : "\t�����";
						String time = times[i] + "��";
						String sumPrice = sumPrices[i] + "Ԫ";
						System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t" + time + "\t\t"
								+ addresses[i] + "\t\t" + sumPrice + "\t" + state);
					}
				}

				break;
			case 3:
				// ǩ�ն���
				System.out.println("***ǩ�ն���***");
				// Ҫ���û�����һ��ǩ�յĶ������
				System.out.print("������Ҫǩ�յĶ������");
				int signOrderId = input.nextInt();
				boolean isFind = false; // ��¼�Ƿ��ҵ����������� Ture�����ҵ� false��û���ҵ�
				// ������������(ѭ������)
				for (int i = 0; i < names.length; i++) {
					// 1.�ҵ���״̬������ɣ��Ѿ�ǩ����ϣ�����ʾ������ǩ��
					// 2.�ҵ���״̬����Ԥ����û�����ǩ�գ�������ǩ��
					if (names[i] != null && states[i] == 1 && signOrderId == i + 1) {
						System.out.println("�Բ�����ѡ��Ķ����Ѿ����ǩ�գ�������ǩ��");
						isFind = true;
						break;
					} else if (names[i] != null && states[i] == 0 && signOrderId == i + 1) {
						states[i] = 1; // ״ֵ̬��Ϊ�����״̬
						System.out.println("����ǩ�ճɹ���");
						isFind = true;
						break;
					}
				}
				// �����жϣ����û���ҵ�������������ȥ��ʾû���ҵ�
				if (!isFind) {
					System.out.println("�Բ���û�д˶�����");
				}
				break;
			case 4:
				System.out.println("***ɾ������***");
				System.out.print("������Ҫɾ���Ķ�����ţ�");
				int delId = input.nextInt();
				int delIndex = -1;
				boolean isDelFind = false; // ��¼�Ƿ��ҵ��˶��� true���ҵ��� falseû�ҵ�
				// ѭ��������������
				for (int i = 0; i < names[i].length(); i++) {
					if (names[i] != null && states[i] == 1 && delId == i + 1) {
						delIndex = i;
						isDelFind = true;
						break;
					} else if (names[i] != null && states[i] == 0 && delId == i + 1) {
						System.out.println("�Բ������Ķ���δǩ�ղ���ɾ��");
						isDelFind = true;
						break;
					}
				}
				break;
			case 5:
				System.out.println("***��Ҫ����***");
				break;
			case 6:
				break;
			default:
				break;

			}
			if (choose < 1 || choose > 5) {
				break;
			} else {
				System.out.print("����0����:");
				num = input.nextInt();
			}
		} while (num == 0);
		System.out.println("��л��ʹ�ã���ӭ�´ι��٣�");
	}
}
