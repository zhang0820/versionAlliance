package demo2;

public class Pretty {

	/*
	 * static int i = 1; static { System.out.println("a"); // �þ�̬����죬ִֻ��һ�� i++; }
	 * 
	 * public Pretty() { System.out.println("b"); i++; }
	 */

	public static void main(String[] args) {

	/*	Pretty t1 = new Pretty();
		System.out.println(t1.i);

		Pretty t2 = new Pretty();
		System.out.println(t2.i);
*/
		
		//����һ��ѧ��
		
	/*	Stu stu1=new Stu(18,"aa",580);
		
		Stu stu2=new Stu(19,"bb",580);
		
		System.out.println(Stu.getTotalFee());
		*/
		Clerk clerk1=new Clerk("С��",24,12000.6f);
		
		System.out.println("������"+clerk1.name+
				  "����нˮ��"+clerk1.getSal());
		
		
	}
}

// ְԱ
class Clerk {
	public String name;
	private int age;
	private float salary;

	public Clerk(String name, int age, float sal) {
		this.name = name;
		this.age = age;
		this.salary = sal;
	}

	// ͨ��һ����Ա����ȥ���ƺͷ���˽�е�����
	public float getSal() {
		return this.salary;
	}
}

// ѧ��
class Stu {
	int age;
	String name;
	int fee;
	static int totalFee;

	public Stu(int age, String name, int fee) {

		this.age = age;
		this.name = name;
		totalFee += fee;

	}

	// ������ѧ��[����һ���෽��(Ҳ���Խо�̬����)]
	// java�й��������ԭ�������෽��ȥ����
	public static int getTotalFee() {

		return totalFee;
	}

}
