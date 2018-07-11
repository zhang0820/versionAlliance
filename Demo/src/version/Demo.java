package version;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		String[] names = new String[4];// 保存订餐人姓名
		String[] dishMegs = new String[4];// e 保存所选信息，包括菜品名及份数
		int[] times = new int[4];// 保存送餐时间
		String[] addresses = new String[4];// 保存送餐地址
		int[] states = new int[4];// 保存订单状态：0表示已预定，1表示已完成
		double[] sumPrices = new double[4];// 保存订单总额
		String[] dishNames = { "红烧带鱼", "鱼香肉丝", "时令鲜蔬" };// 菜品名称
		double[] prices = new double[] { 30.8, 20.0, 10.0, };// 菜品单价
		int[] praiseNums = new int[3];// 点赞数
		System.out.println("\t欢迎使用吃货联盟订餐系统");
		Scanner input = new Scanner(System.in);
		int num = -1;
		boolean isExit = false;
		do {
			menu();
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("********1.我要订餐********");
				boolean isAdd = false;
				for (int i = 0; i < names.length; i++) {
					if (names[i] == null) {
						isAdd = true;
						System.out.print("请输入订餐人姓名:");
						String name = input.next();
						System.out.println("序号\t" + "菜名\t" + "单价\t" + "点赞数");
						for (int j = 0; j < dishNames.length; j++) {
							String price = prices[j] + "元";
							String praiseNum = (praiseNums[j]) > 0 ? praiseNums[j] + "赞" : "0";
							System.out.println((j + 1) + "\t" + dishNames[j] + "\t" + price + "\t" + praiseNum);
						}
						System.out.print("请选择您需要的菜品编号:");
						int serial = input.nextInt();
						System.out.print("请选择你需要的份数:");
						int portion = input.nextInt();
						String dishMeg = dishNames[serial - 1] + " " + portion + "份";
						double canfei = prices[serial - 1] * portion;
						double charge = (canfei >= 50) ? 0 : 5;
						System.out.print("请输入送餐时间:（时间是10点至20点整送餐）");
						int time = input.nextInt();
						while (time < 10 || time > 20) {
							System.out.print("您输入的有误请输入10到20点之间的整数");
							time = input.nextInt();
						}
						System.out.print("请输入送餐地址:");
						String site = input.next();
						System.out.println("订餐成功！");
						System.out.println("您订的是" + dishMeg);
						System.out.println("送餐时间" + time + "点");
						System.out.println("餐费:" + canfei + "元,送餐费" + charge + "元,总计:" + (canfei + charge) + "元");
						names[i] = name;
						dishMegs[i] = dishMeg;
						times[i] = time;
						addresses[i] = site;
						sumPrices[i] = canfei + charge;
						break;
					}
					if (!isAdd) {
						System.out.println("对不起，您的餐袋已满!");
					}
				}
				break;
			case 2:
				System.out.println("********2.查看餐袋********");
				System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t\t送餐地址\t\t总金额\t\t订单状态");
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String state = (states[i] == 0) ? "\t已预定" : "\t已完成";
						String date = times[i] + "点";
						String sumPrice = sumPrices[i] + "元";
						System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t" + date + "\t\t"
								+ addresses[i] + "\t\t" + sumPrice + "\t" + state);
					}
				}
				break;
			case 3:
				System.out.println("********3.签收订单********");
				boolean isSignFind = false;
				System.out.println("请选择要签收的订单号:");
				int signOrderId = input.nextInt();
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && states[i] == 0 && signOrderId == i + 1) {
						states[i] = 1;
						System.out.println("订单签收成功！");
						isSignFind = true;
					}
				}
				break;
			case 4:
				System.out.println("********4.删除订单********");
				boolean isDelFind = false;
				System.out.println("请输入要删除的订单号:");
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
						System.out.println("删除订单成功！");
						break;
					} else if (names[i] != null && states[i] == 0 && delId == i + 1) {
						System.out.println("您选择的订单未签收，不能删除！");
						isDelFind = true;
						break;
					}
				}
				if (!isDelFind) {
					System.out.println("您要删除的订单不存在！");
				}
				break;
			case 5:
				System.out.println("********5.我要点赞********");
				System.out.println("序号" + "\t" + "菜名" + "\t" + "单价");
				for (int i = 0; i < dishNames.length; i++) {
					String price = prices[i] + "元";
					String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i] + "赞" : "";
					System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + price + "\t" + priaiseNum);
				}
				System.out.println("请选择您要点赞的菜品编号:");
				int priaiseNum = input.nextInt();
				praiseNums[priaiseNum - 1]++;
				System.out.println("点赞成功！");
				break;
			case 6:
				isExit = true;
				System.out.println("感谢的使用，欢迎下次光临！");
				break;
			}
			if (!isExit) {
				System.out.println("输入0返回:");
				num = input.nextInt();
			} else {
				break;
			}
		} while (num == 0);
	}

	public static void menu() {
		System.out.println("欢迎使用“吃货联盟订餐系统”");
		System.out.println("********************************\n");
		System.out.println("1.我要订餐");
		System.out.println("2.查看餐袋");
		System.out.println("3.签收订单");
		System.out.println("4.删除订单");
		System.out.println("5.我要点赞");
		System.out.println("6.提出系统\n");
		System.out.println("********************************\n");
		System.out.print("请选择");

	}
}
