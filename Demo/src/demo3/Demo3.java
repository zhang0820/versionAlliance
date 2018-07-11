package demo3;

public class Demo3 {
	
	
	public static void main(String []args) 
	  {
		
		Dog dog1=new Dog(2,"大黄");
		
		
		Person p1=new Person(dog1,23,"郭德纲");
		Person p2=new Person(dog1,25,"刘谦");
		p1.showInfo();
		p1.dog.showInfo();   
		
		
		Child ch1=new Child(5,"倪倪");
		ch1.joinGame();

		Child ch2=new Child(6,"桓桓");

		ch2.joinGame();
		
		Child ch3=new Child(4,"红红");

		ch3.joinGame();
		System.out.println("共有="+Child.total);
	   } 

}
//定义小孩类
class Child
{
	int age;
	String name;
	//total是静态变量，因此它可以被任何一个对象访问
	static int total=0;
	public Child(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public void joinGame()
	{
		total++;
		System.out.println("有一个小孩加入了");
	}
	
	
	
}
  



//定义一个人类
class Person{
	//成员变量
	int age;
	String name;
	Dog dog;//引用类型
	
	public Person(Dog dog,int age,String name) {
		//可读性不好
		this.age=age;
		this.name=name;
		this.dog=dog;
	}
	//显示人的名字
	public void showInfo() {
		System.out.println("人名是："+name);
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
		System.out.println("狗名叫"+this.name);
	}
}