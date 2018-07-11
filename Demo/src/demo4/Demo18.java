package demo4;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Demo18 {

	

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "普京";
		p1.nianling = 18;
		p1.sex = '男';
		p1.sg = 160;
		p1.shuxing();
		p1.eat("网易");
		
		
		Person p2 = new Person();
		p2.name = "小布什";
		p2.nianling = 20;
		p2.sex = '男';
		p2.sg = 160;
		p2.shuxing();
		p2.eat("网易");
		
	}
}

class Person {
	String name;// 姓名
	int nianling; // 年龄
	char sex;// 性别
	int sg;

	public void shuxing() {
		System.out.println("大家好，我是：" + name + "\t我的身高是：" + sg + "\t年龄是：" + nianling + "\t性别：" + sex);
		System.out.println(name+"在吃饭");
		System.out.println(name + "睡觉");
	}
	
	public void eat(String username) {
		System.out.println(name+"在和"+username+"吃饭");
	}
}