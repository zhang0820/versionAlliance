package demo2;

public class Ding {

	static int i = 1;
	static {
		//该静态区域快，只执行一次
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
