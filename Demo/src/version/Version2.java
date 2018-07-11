package version;

import java.lang.Thread.State;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Version2 {

	// 类变量
	static User[] users = new User[5];
	static Food[] foods = new Food[5];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Food f1 = new Food();
		f1.foodId = 1;
		f1.foodName = "鱼香肉丝";
		f1.price = 18.0;
		f1.praise = 0;
		foods[0] = f1;

		Food f2 = new Food();
		f2.foodId = 2;
		f2.foodName = "红烧带鱼";
		f2.price = 32.0;
		f2.praise = 0;
		foods[1] = f2;

		Food f3 = new Food();
		f3.foodId = 3;
		f3.foodName = "时令鲜蔬";
		f3.price = 13.0;
		f3.praise = 0;
		foods[2] = f3;

		Food f4 = new Food();
		f4.foodId = 4;
		f4.foodName = "宫保鸡丁";
		f4.price = 16.0;
		f4.praise = 0;
		foods[3] = f4;

		Food f5 = new Food();
		f5.foodId = 5;
		f5.foodName = "水果沙拉";
		f5.price = 10.0;
		f5.praise = 0;
		foods[4] = f5;

		int fan = 0;
		do {

			// 输出操作菜单
			menu();

			// 接收输入，判断用户输入,输入0返回
			int shu = input.nextInt();

			switch (shu) {
			case 1:
				System.out.println("*****我要订餐*****");

				int temp = -1;
				// 判断数组有没有位置
				for (int i = 0; i < users.length; i++) {
					if (users[i] == null) {

						temp = i;
						break;
					}
				}

				if (temp == -1) {
					System.out.println("订单已满");
					break;
				}

				// 创建一个新的用户
				User u = new User();
				u.food = new Food();
				// 点餐

				// 显示菜单
				recipe();

				// 订餐 让用户输入姓名，手机号，餐品序号，份数，送餐时间，送餐地址
				System.out.print("请选择您要点的菜品序号：");
				u.food.foodId = input.nextInt();
				if (u.food.foodId >= 1 && u.food.foodId <= 5) {
					System.out.print("请选择您需要的份数：");
					u.food.number = input.nextInt();
				} else {
					System.out.println("对不起，没有您要的菜，请重新输入：");
					break;
				}
				System.out.print("请输入订餐姓名：");
				u.name = input.next();
				System.out.print("请输入手机号：");
				u.phone = input.next();
				System.out.print("请输入送餐时间：");
				u.time = input.next();
				System.out.print("请输入送餐地址：");
				u.address = input.next();

				u.food.foodName = foods[u.food.foodId - 1].foodName;
				u.food.foodId = foods[u.food.foodId - 1].foodId;
				u.food.price = foods[u.food.foodId - 1].price;
				System.out.println("订餐成功");
				System.out.println("您订的是：" + foods[u.food.foodId - 1].foodName + u.food.number + "份");
				System.out.println("送餐时间是：" + u.time);
				u.unmFood = foods[u.food.foodId - 1].price * u.food.number;
				// 判断 消费上50元 减6元配送费 否则加6元配送费

				double num1 = 6;
				if (u.unmFood <= 50) {
					u.unmFood += 6;
				} else {
					num1 = 0;
				}

				System.out.println("餐费总价格是：" + (u.unmFood) + "元" + "   配送费：" + num1 + "元");
				System.out.println("电话号：" + u.phone);
				System.out.println("地址是：" + u.address);
				users[temp] = u;
				break;
			case 2:
				System.out.println("*****查看餐袋*****");
				// 查看餐袋
				view();
				break;
			case 3:
				System.out.println("*****签收订单*****");
				// 签收订单
				view();
				System.out.println("请选择要签订的订单序号：");
				int id = input.nextInt();
				boolean isFind = false;
				// 状态为已预定，序号为用户输入的订单减1：可签收
				// 状态为已完成，序号为用户输入的订单序号减1： 不可签收
				for (int i = 0; i < users.length; i++) {
					if (users[i] != null && users[i].state == 0 && id == i + 1) {
						users[i].state = 1;
						System.out.println("签收成功");
						isFind = true;
					} else if (users[i] != null && users[i].state == 1 && id == i + 1) {
						System.out.println("对不起。您选择的订单已经完成签收，不能再签收");
						isFind = true;
					}
				}
				if (!isFind) {
					System.out.println("对不起，没有此订单！");
				}
				break;
			case 4:
				System.out.println("*****删除订单*****");

				// 删除订单

				view();

				System.out.println("请您选择要删除的订单序号：");
				int uid = input.nextInt();
				boolean pp = false;
				// 需要判断已签收的可以删除，，未签收的不能删除
				for (int i = 0; i < users.length; i++) {

					if (users[uid - 1] != null && users[i].state == 0) {
						System.out.println("未完成，不能删除");
						pp = false;
						break;
					} else if (users[uid - 1] != null && users[i].state == 1) {
						users[uid - 1] = null;
						System.out.println("删除成功");
						pp = true;
						break;
					}
				}
				if (users[uid - 1] == null && pp == false)
					System.out.println("对不起，没有此订单！");
				break;

			case 5:
				System.out.println("*****我要点赞*****");
				// 要求点赞
				recipe();
				System.out.print("请您选择要点赞的菜品序号：");
				int xu = input.nextInt();
				if (xu >= 1 && xu <= 5) {
					foods[xu - 1].praise += 1;
					System.out.println("点赞成功！");
				} else {
					System.out.println("输入错误");
					break;
				}
				break;
			case 6:
				System.out.println("谢谢使用，欢迎下次光临！");
				System.exit(0);
				break;
			default:
				System.out.println("输入有误，请重新输入");
				continue;
			}

			System.out.print("输入0退出，输入其他任意数值返回");
			fan = input.nextInt();

		} while (fan != 0);
		System.out.println("谢谢使用，欢迎下次光临！");

	}

	// 这是一个执行菜单方法
	public static void menu() {

		System.out.println("—————————欢迎使用“吃货联盟订餐系统”——————————\n");
		System.out.println("************************");
		System.out.println("1.我要订餐");
		System.out.println("2.查看餐袋");
		System.out.println("3.签收订单");
		System.out.println("4.删除订单");
		System.out.println("5.我要点赞");
		System.out.println("6.退出系统");
		System.out.println("************************");
		System.out.print("请选择：");
	}

	// 这是一个菜单方法
	public static void recipe() {
		for (Food food : foods) {
			System.out.println(
					"序号：" + food.foodId + "\t名称：" + food.foodName + "\t价格：" + food.price + "\t点赞数" + food.praise);

		}
	}

	// 查看餐袋
	public static void view() {
		System.out.println("序号\t订餐人\t餐品名称\t\t送餐时间\t\t送餐地址\t\t总金额\t\t订单状态");
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null)
				break;
			System.out.println((i + 1) + "\t" + users[i].name + "\t" + users[i].food.foodName + "\t\t" + users[i].time
					+ "\t\t" + users[i].address + "\t\t" + users[i].unmFood + "元\t\t"
					+ ((users[i].state == 0 ? "未完成" : "已完成")));

		}
	}
}

// 用户类
 class User {
	String name;// 姓名
	String phone;// 手机号
	String time;// 送餐时间
	String address;// 地址
	double unmFood;// 总价格
	Food food;// 新的用户
	int state = 0;// 订单状态
}

// 菜类
class Food {
	int foodId;// 序号
	String foodName; // 菜品名字
	int number;// 数量
	double price;// 单价
	int praise;// 赞

}