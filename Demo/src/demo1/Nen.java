package demo1;

//�������
public class Nen {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= n; i++)// ��������
		{
			for (int k = n - 1; k >= i; k--)// ��ӡ�ո�
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++)// ��ӡ*
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int k = i; k <= n - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}