package demo3;

public class Demo3 {
	
	
	public static void main(String []args) 
	  {
		
		Dog dog1=new Dog(2,"���");
		
		
		Person p1=new Person(dog1,23,"���¸�");
		Person p2=new Person(dog1,25,"��ǫ");
		p1.showInfo();
		p1.dog.showInfo();   
		
		
		Child ch1=new Child(5,"����");
		ch1.joinGame();

		Child ch2=new Child(6,"����");

		ch2.joinGame();
		
		Child ch3=new Child(4,"���");

		ch3.joinGame();
		System.out.println("����="+Child.total);
	   } 

}
//����С����
class Child
{
	int age;
	String name;
	//total�Ǿ�̬��������������Ա��κ�һ���������
	static int total=0;
	public Child(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public void joinGame()
	{
		total++;
		System.out.println("��һ��С��������");
	}
	
	
	
}
  



//����һ������
class Person{
	//��Ա����
	int age;
	String name;
	Dog dog;//��������
	
	public Person(Dog dog,int age,String name) {
		//�ɶ��Բ���
		this.age=age;
		this.name=name;
		this.dog=dog;
	}
	//��ʾ�˵�����
	public void showInfo() {
		System.out.println("�����ǣ�"+name);
	}
}

class Dog{
	
	int age;
	String name;
	public Dog(int age,String name){
		this.age=age;
		this.name=name;
	}
	public void showInfo() {
		System.out.println("������"+this.name);
	}
}