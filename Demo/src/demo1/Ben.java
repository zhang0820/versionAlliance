package demo1;

public class Ben {
	public static void main(String[] args) {
		
		char h= 'j';

		switch (h) {

		case 'a':
			System.out.println("今天星期一");
			break; // break,表示跳出switch
		case 'b':
			System.out.println("今天星期二");
			break;
		case 'c':
			System.out.println("今天星期三");
			break;
		case 'd':
			System.out.println("今天星期四");
			break;
		case 'e':
			System.out.println("今天星期五");
			break;
		case 'f':
			System.out.println("今天星期六");
			break;
		case 'g':
			System.out.println("今天星期日");
			break;
		default:
			System.out.println("我不知道");
		}
	}
}
