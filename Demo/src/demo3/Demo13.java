package demo3;

import java.util.Arrays;

public class Demo13 {

	public static void main(String[] args) {
		// equals() ���Ƚ�������ֵ�Ƿ����
		int[] arr1 = { 10, 50, 40, 30 };
		int[] arr2 = { 50, 20, 40, 25 };
		int[] arr3 = { 60, 50, 85 };

		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
		System.out.println("*************************************************");

		// aort():�����������������
		Arrays.sort(arr2);
		for (int num : arr2) {
			System.out.print(num + "\t");
		}
		System.out.println("\n�������н��");
		for (int i = arr1.length - 1; i >= 0; i--) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println("\n*************************************************");

		// toString():��һ������ת����һ���ַ���
		System.out.println(Arrays.toString(arr1));
		System.out.println("\n*************************************************");

		// fill():��������и�ֵ
		int[] arrs = { 10, 30, 56, 95 };
		Arrays.fill(arrs, 40);
		System.out.println(Arrays.toString(arrs));

		System.out.println("\n*************************************************");

		// copyOf():�����鸴�Ƴ�һ���µĳ��ȵ�����
		int[] arr11 = { 10, 56, 65, 89, 26 };
		int[] arr22 = Arrays.copyOf(arr11, 10);
		System.out.println(Arrays.toString(arr22));
		int[] arr33 = Arrays.copyOf(arr11, 8);
		System.out.println(Arrays.toString(arr33));

		// binarySearch():����ĳ��Ԫ���������е�λ��(ǰ�᣺�����Ѿ��������к�)
		System.out.println("***************************************************");
		int[] nums = { 85, 56, 59, 64 };
		Arrays.sort(nums);
		int index = Arrays.binarySearch(nums, 56);
		System.out.println(index);
		int index1 = Arrays.binarySearch(nums, 85);
		System.out.println(index1);

		System.out.println("***************************************************");
		// ѡ������
		int[] arr = { 4, 7, 3, 9, 1 };
		int min = -1;// ��Сֵ�����

		// ��㣻�Ƚ�
		for (int i = 0; i < arr.length - 1; i++) {
			min = i; // ÿ��min��ʼֵ
			// �ڲ㣺��ǰԪ�غͺ����Ԫ�رȽϣ���¼���µ���СԪ���±�
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			// ���minֵ�����仯��˵�����ָ�С��ֵ���򽫵�ǰֵ�͸�С��ֵ��������֤Сֵ��������ǰ��
			if (min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}for(int num:arr) {
			System.out.print(num+" ");
		}

	}

}
