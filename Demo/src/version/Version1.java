package version;

//吃货联盟订餐系统
//2018.7.7
//zhangrui

import java.text.BreakIterator;
import java.util.Scanner;

public class Version1 {

	public static void main(String[] args) {
		// 一组订单
		int choose = 0;
		String[] names = new String[4];// 保存订餐人姓名
		String[] dishMegs = new String[4];// 所订餐品信息
		int[] times = new int[4];// 送餐时间
		String[] addresses = new String[4];// 送餐地址
		int[] states = new int[4];// 送餐状态
		double[] sumPrices = new double[4]; // 总金额
		Scanner input = new Scanner(System.in);
		// 一组餐品
		String[] dishNames = { "红烧带鱼", "鱼香肉丝", "时令蔬菜" };
		double[] prices = { 38.0, 18.0, 10.0 };
		int[] praiseNums = new int[3];
		int num = -1; // 用户输入0返回主菜单，否则退出系统
		do {
			System.out.println("——————————欢迎使用“吃货联盟订餐系统——————————");
			System.out.println("********************************\n");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.提出系统\n");
			System.out.println("********************************\n");
			System.out.print("请选择");
			choose = input.nextInt();// 记录用户选择的功能编号
			boolean isAdd = false; // Ture:记录找到一个为空的位置,可以插入 false:没有找到
			// 根据用户输入的功能编号，执行相应的功能
			switch (choose) {
			case 1:
				// 订餐
				System.out.println("***我要订餐***");
				// 查找要插入的位置
				for (int i = 0; i < names.length; i++) {
					if (names[i] == null) {
						isAdd = true; // 记录已找到一个为空的位置
						// 执行插入操作
						// 显示所有可供选择的餐品信息
						System.out.println("序号\t餐品名\t价格\t点赞数");
						for (int j = 0; j < praiseNums.length; j++) {
							String price = prices[j] + "元";
							String praise = praiseNums[j] + "赞";
							System.out.println(+(j + 1) + "\t" + dishNames[j] + "\t" + price + "\t" + praise);

						}
						// 输入所选餐品编号及份数
						System.out.print("请选择所定餐品序号：");
						int chooseDish = input.nextInt();

						// 输入份数
						System.out.print("请选择所定份数：");
						int number = input.nextInt();

						String dishMeg = dishNames[chooseDish - 1] + " " + number + "份";

						// 输入订餐人姓名
						System.out.print("请输入订餐人姓名：");
						String name = input.next();

						// 输入送餐时间
						System.out.print("请输入送餐时间(10点~20点整)：");
						int time = input.nextInt();

						// 如果输入错误，重新输入
						while (time < 10 || time > 20) {
							System.out.println("对不起，您输入的时间不在派送时间内(10~20)");
							time = input.nextInt();
						}

						// 输入送餐地址
						System.out.print("请输入送餐地址：");
						String address = input.next();

						// 计算餐费
						double sumPrice = prices[chooseDish - 1] * number;
						// 送餐费，当餐费到50元时 免6元送餐费
						double deliCharge = sumPrice >= 50 ? 0.0 : 6.0;

						// 显示订单信息
						System.out.println("订餐成功");
						System.out.println("您订的是：" + dishMeg);
						System.out.println("订餐人：" + name);
						System.out.println("送餐时间：" + time + "点");
						System.out.println("送餐地址：" + address);
						System.out.println("餐费：" + sumPrice + "，送餐费：" + deliCharge);
						System.out.println("总金额：" + (sumPrice + deliCharge) + "元");

						// 保存数据
						names[i] = name;
						dishMegs[i] = dishMeg;
						times[i] = time;
						addresses[i] = address;
						sumPrices[i] = sumPrice + deliCharge;

						break;
					}
				}
				// 如果没有找到二五空的位置，则提示信息
				if (!isAdd) {
					System.out.println("对不起，您的餐袋已满");
				}
				break;
			case 2:
				// 查看餐袋
				System.out.println("***查看餐袋***");
				System.out.println("序号\t订餐人\t所订餐品信息\t送餐时间\t\t送餐地址\t\t总金额\t\t状态");
				// 遍历数组
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String state = (states[i] == 0) ? "\t已预定" : "\t已完成";
						String time = times[i] + "点";
						String sumPrice = sumPrices[i] + "元";
						System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t" + time + "\t\t"
								+ addresses[i] + "\t\t" + sumPrice + "\t" + state);
					}
				}

				break;
			case 3:
				// 签收订单
				System.out.println("***签收订单***");
				// 要求用户输入一个签收的订单序号
				System.out.print("请输入要签收的订单序号");
				int signOrderId = input.nextInt();
				boolean isFind = false; // 记录是否找到了这条订单 Ture：已找到 false：没有找到
				// 查找这条订单(循环遍历)
				for (int i = 0; i < names.length; i++) {
					// 1.找到，状态是已完成（已经签收完毕）：提示不能再签收
					// 2.找到，状态是已预定（没有完成签收）：可以签收
					if (names[i] != null && states[i] == 1 && signOrderId == i + 1) {
						System.out.println("对不起。您选择的订单已经完成签收，不能再签收");
						isFind = true;
						break;
					} else if (names[i] != null && states[i] == 0 && signOrderId == i + 1) {
						states[i] = 1; // 状态值该为已完成状态
						System.out.println("订单签收成功！");
						isFind = true;
						break;
					}
				}
				// 条件判断：如果没有找到这条订单，才去提示没有找到
				if (!isFind) {
					System.out.println("对不起，没有此订单！");
				}
				break;
			case 4:
				System.out.println("***删除订单***");
				System.out.print("请输入要删除的订单序号：");
				int delId = input.nextInt();
				int delIndex = -1;
				boolean isDelFind = false; // 记录是否找到此订单 true：找到了 false没找到
				// 循环查找这条订单
				for (int i = 0; i < names[i].length(); i++) {
					if (names[i] != null && states[i] == 1 && delId == i + 1) {
						delIndex = i;
						isDelFind = true;
						break;
					} else if (names[i] != null && states[i] == 0 && delId == i + 1) {
						System.out.println("对不起，您的订单未签收不能删除");
						isDelFind = true;
						break;
					}
				}
				break;
			case 5:
				System.out.println("***我要点赞***");
				break;
			case 6:
				break;
			default:
				break;

			}
			if (choose < 1 || choose > 5) {
				break;
			} else {
				System.out.print("输入0返回:");
				num = input.nextInt();
			}
		} while (num == 0);
		System.out.println("感谢的使用，欢迎下次光临！");
	}
}
