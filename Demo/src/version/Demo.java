package version;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		String[] names = new String[4];// ���涩��������
		String[] dishMegs = new String[4];// e ������ѡ��Ϣ��������Ʒ��������
		int[] times = new int[4];// �����Ͳ�ʱ��
		String[] addresses = new String[4];// �����Ͳ͵�ַ
		int[] states = new int[4];// ���涩��״̬��0��ʾ��Ԥ����1��ʾ�����
		double[] sumPrices = new double[4];// ���涩���ܶ�
		String[] dishNames = { "���մ���", "������˿", "ʱ������" };// ��Ʒ����
		double[] prices = new double[] { 30.8, 20.0, 10.0, };// ��Ʒ����
		int[] praiseNums = new int[3];// ������
		System.out.println("\t��ӭʹ�óԻ����˶���ϵͳ");
		Scanner input = new Scanner(System.in);
		int num = -1;
		boolean isExit = false;
		do {
			menu();
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("********1.��Ҫ����********");
				boolean isAdd = false;
				for (int i = 0; i < names.length; i++) {
					if (names[i] == null) {
						isAdd = true;
						System.out.print("�����붩��������:");
						String name = input.next();
						System.out.println("���\t" + "����\t" + "����\t" + "������");
						for (int j = 0; j < dishNames.length; j++) {
							String price = prices[j] + "Ԫ";
							String praiseNum = (praiseNums[j]) > 0 ? praiseNums[j] + "��" : "0";
							System.out.println((j + 1) + "\t" + dishNames[j] + "\t" + price + "\t" + praiseNum);
						}
						System.out.print("��ѡ������Ҫ�Ĳ�Ʒ���:");
						int serial = input.nextInt();
						System.out.print("��ѡ������Ҫ�ķ���:");
						int portion = input.nextInt();
						String dishMeg = dishNames[serial - 1] + " " + portion + "��";
						double canfei = prices[serial - 1] * portion;
						double charge = (canfei >= 50) ? 0 : 5;
						System.out.print("�������Ͳ�ʱ��:��ʱ����10����20�����Ͳͣ�");
						int time = input.nextInt();
						while (time < 10 || time > 20) {
							System.out.print("�����������������10��20��֮�������");
							time = input.nextInt();
						}
						System.out.print("�������Ͳ͵�ַ:");
						String site = input.next();
						System.out.println("���ͳɹ���");
						System.out.println("��������" + dishMeg);
						System.out.println("�Ͳ�ʱ��" + time + "��");
						System.out.println("�ͷ�:" + canfei + "Ԫ,�Ͳͷ�" + charge + "Ԫ,�ܼ�:" + (canfei + charge) + "Ԫ");
						names[i] = name;
						dishMegs[i] = dishMeg;
						times[i] = time;
						addresses[i] = site;
						sumPrices[i] = canfei + charge;
						break;
					}
					if (!isAdd) {
						System.out.println("�Բ������Ĳʹ�����!");
					}
				}
				break;
			case 2:
				System.out.println("********2.�鿴�ʹ�********");
				System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�ʱ��\t\t�Ͳ͵�ַ\t\t�ܽ��\t\t����״̬");
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String state = (states[i] == 0) ? "\t��Ԥ��" : "\t�����";
						String date = times[i] + "��";
						String sumPrice = sumPrices[i] + "Ԫ";
						System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t" + date + "\t\t"
								+ addresses[i] + "\t\t" + sumPrice + "\t" + state);
					}
				}
				break;
			case 3:
				System.out.println("********3.ǩ�ն���********");
				boolean isSignFind = false;
				System.out.println("��ѡ��Ҫǩ�յĶ�����:");
				int signOrderId = input.nextInt();
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && states[i] == 0 && signOrderId == i + 1) {
						states[i] = 1;
						System.out.println("����ǩ�ճɹ���");
						isSignFind = true;
					}
				}
				break;
			case 4:
				System.out.println("********4.ɾ������********");
				boolean isDelFind = false;
				System.out.println("������Ҫɾ���Ķ�����:");
				int delId = input.nextInt();
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && states[i] == 1 && delId == i + 1) {
						isDelFind = true;
						for (int j = delId - 1; j < names.length; j++) {
							names[j] = names[j + 1];
							dishMegs[j] = dishMegs[j + 1];
							times[j] = times[j + 1];
							addresses[j] = addresses[j + 1];
							states[j] = states[j + 1];
							sumPrices[j] = sumPrices[j + 1];
						}
						int enIndex = names.length - 1;
						names[enIndex] = null;
						dishMegs[enIndex] = null;
						times[enIndex] = 0;
						addresses[enIndex] = null;
						states[enIndex] = 0;
						sumPrices[enIndex] = 0;
						System.out.println("ɾ�������ɹ���");
						break;
					} else if (names[i] != null && states[i] == 0 && delId == i + 1) {
						System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
						isDelFind = true;
						break;
					}
				}
				if (!isDelFind) {
					System.out.println("��Ҫɾ���Ķ��������ڣ�");
				}
				break;
			case 5:
				System.out.println("********5.��Ҫ����********");
				System.out.println("���" + "\t" + "����" + "\t" + "����");
				for (int i = 0; i < dishNames.length; i++) {
					String price = prices[i] + "Ԫ";
					String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i] + "��" : "";
					System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + price + "\t" + priaiseNum);
				}
				System.out.println("��ѡ����Ҫ���޵Ĳ�Ʒ���:");
				int priaiseNum = input.nextInt();
				praiseNums[priaiseNum - 1]++;
				System.out.println("���޳ɹ���");
				break;
			case 6:
				isExit = true;
				System.out.println("��л��ʹ�ã���ӭ�´ι��٣�");
				break;
			}
			if (!isExit) {
				System.out.println("����0����:");
				num = input.nextInt();
			} else {
				break;
			}
		} while (num == 0);
	}

	public static void menu() {
		System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
		System.out.println("********************************\n");
		System.out.println("1.��Ҫ����");
		System.out.println("2.�鿴�ʹ�");
		System.out.println("3.ǩ�ն���");
		System.out.println("4.ɾ������");
		System.out.println("5.��Ҫ����");
		System.out.println("6.���ϵͳ\n");
		System.out.println("********************************\n");
		System.out.print("��ѡ��");

	}
}
