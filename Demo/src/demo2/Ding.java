package demo2;

public class Ding {

	static int i = 1;
	static {
		//�þ�̬����죬ִֻ��һ��
		i++;
	}

	public Ding() {
		 
		i++;
	}

	public static void main(String[] args) {

		Ding t1 = new Ding();
		System.out.println(t1.i);

		Ding t2 = new Ding();
		System.out.println(t2.i);
	}
}
