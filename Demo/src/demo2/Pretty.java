package demo2;

public class Pretty {

	/*
	 * static int i = 1; static { System.out.println("a"); // 该静态区域快，只执行一次 i++; }
	 * 
	 * public Pretty() { System.out.println("b"); i++; }
	 */

	public static void main(String[] args) {

	/*	Pretty t1 = new Pretty();
		System.out.println(t1.i);

		Pretty t2 = new Pretty();
		System.out.println(t2.i);
*/
		
		//创建一个学生
		
	/*	Stu stu1=new Stu(18,"aa",580);
		
		Stu stu2=new Stu(19,"bb",580);
		
		System.out.println(Stu.getTotalFee());
		*/
		Clerk clerk1=new Clerk("小花",24,12000.6f);
		
		System.out.println("名字是"+clerk1.name+
				  "她的薪水是"+clerk1.getSal());
		
		
	}
}

// 职员
class Clerk {
	public String name;
	private int age;
	private float salary;

	public Clerk(String name, int age, float sal) {
		this.name = name;
		this.age = age;
		this.salary = sal;
	}

	// 通过一个成员方法去控制和访问私有的属性
	public float getSal() {
		return this.salary;
	}
}

// 学生
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

	// 返回总学费[这是一个类方法(也可以叫静态方法)]
	// java中规则：类变量原则上用类方法去访问
	public static int getTotalFee() {

		return totalFee;
	}

}
