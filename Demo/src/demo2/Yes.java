package demo2;

class Person {
	int age;
	String name;

	public Person(int age, String name) {
		System.out.println("���ǹ���1");
		age = age;
		name = name;
	}

	public Person(String name) {
		System.out.println("���ǹ���2");
		name = name;
	}

	public void speak() {
		System.out.println("����һ������");
	}

	public void jiSuan() {
		int result = 0;
		for (int i = 1; i <= 1000; i++) {
			result = result + i;
		}

		System.out.println("�����" + result);

	}

	public void jiSuan(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;

		}
		System.out.println("�����" + result);
	}

	public void add(int num1, int num2) {
		int result = 0;
		result = num1 + num2;

		System.out.println("����" + result);
	}

	public int add2(int num1, int num2) {
		return num1 + num2;
	}

	public float akk(int num1, float num2, float num3) {
		return num1 + num2 + num3;
	}

}

class cat {
	int age;
	String name;
	String color;
}

public class Yes {
	public static void main(String[] args) {

		/*
		 * person a=new person(); a.age=10; a.name="С��";
		 * 
		 * 
		 * 
		 * person b; b=a; System.out.println(b.age); person c; c=b;
		 * System.out.println("c.name="+c.name);
		 * 
		 * c.age=9; System.out.println("a.age="+a.age);
		 * System.out.println("b.age="+b.age); System.out.println("c.age="+c.age);
		 */

		Person p1 = new Person(10, "����");
		// ����speak����
		p1.speak();
		p1.jiSuan();
		p1.jiSuan(10);
		p1.add(12, 14);
		int res = p1.add2(29, 50);
		System.out.println("res=" + res);

		System.out.println("akk=" + p1.akk(2, 2.8f, 5.6f));

	}

}
