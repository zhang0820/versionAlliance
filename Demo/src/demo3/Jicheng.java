package demo3;
//�̳е���Ҫ�ԡ���
public class Jicheng {
	public static void main(String[] args) {
	
		Pupil p1=new Pupil();
		p1.printName();
		
	}
}
//��ѧ���Ĺ�ͬ�����������һ������
class Stu{
	//�����Ա����
		public int age;
		public String name;
		public float fee;
		
		
		private String job;
		//����У������ϣ������̳�ĳ�����Ի��߷���
		//�ͽ�������Ϊprivate

		public void printName() {
			
			System.out.println("���֣�"+this.name);
		}
}

//Сѧ����
class Pupil extends Stu{
	//�����Ա����
//	private int age;
//	private String name;
//	private float fee;
	
	//����
	public void pay(float fe) {
		
		this.fee=fee;
	}
	
} 
//��ѧ����
class MiddleStu extends Stu{
	//�����Ա����
//		private int age;
//		private String name;
//		private float fee;
		
		//����
		public void pay(float fe) {
			
			this.fee=fee*0.8f;
	}
}
//��ѧ����
class CoolStu extends Stu{
	//�����Ա����
//		private int age;
//		private String name;
//		private float fee;
		
		//����
		public void pay(float fe) {
			
			this.fee=fee*0.5f;
	}
}