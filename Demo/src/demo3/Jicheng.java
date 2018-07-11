package demo3;
//继承的重要性。。
public class Jicheng {
	public static void main(String[] args) {
	
		Pupil p1=new Pupil();
		p1.printName();
		
	}
}
//将学生的共同属性提出，做一个父类
class Stu{
	//定义成员属性
		public int age;
		public String name;
		public float fee;
		
		
		private String job;
		//编程中，如果不希望子类继承某个属性或者方法
		//就将其声明为private

		public void printName() {
			
			System.out.println("名字："+this.name);
		}
}

//小学生类
class Pupil extends Stu{
	//定义成员属性
//	private int age;
//	private String name;
//	private float fee;
	
	//交费
	public void pay(float fe) {
		
		this.fee=fee;
	}
	
} 
//中学生类
class MiddleStu extends Stu{
	//定义成员属性
//		private int age;
//		private String name;
//		private float fee;
		
		//交费
		public void pay(float fe) {
			
			this.fee=fee*0.8f;
	}
}
//大学生类
class CoolStu extends Stu{
	//定义成员属性
//		private int age;
//		private String name;
//		private float fee;
		
		//交费
		public void pay(float fe) {
			
			this.fee=fee*0.5f;
	}
}