package demo4;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Demo18 {

	

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "�վ�";
		p1.nianling = 18;
		p1.sex = '��';
		p1.sg = 160;
		p1.shuxing();
		p1.eat("����");
		
		
		Person p2 = new Person();
		p2.name = "С��ʲ";
		p2.nianling = 20;
		p2.sex = '��';
		p2.sg = 160;
		p2.shuxing();
		p2.eat("����");
		
	}
}

class Person {
	String name;// ����
	int nianling; // ����
	char sex;// �Ա�
	int sg;

	public void shuxing() {
		System.out.println("��Һã����ǣ�" + name + "\t�ҵ�����ǣ�" + sg + "\t�����ǣ�" + nianling + "\t�Ա�" + sex);
		System.out.println(name+"�ڳԷ�");
		System.out.println(name + "˯��");
	}
	
	public void eat(String username) {
		System.out.println(name+"�ں�"+username+"�Է�");
	}
}