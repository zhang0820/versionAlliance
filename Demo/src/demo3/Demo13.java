package demo3;

import java.util.Arrays;

public class Demo13 {

	public static void main(String[] args) {
		// equals() ：比较两个数值是否相等
		int[] arr1 = { 10, 50, 40, 30 };
		int[] arr2 = { 50, 20, 40, 25 };
		int[] arr3 = { 60, 50, 85 };

		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
		System.out.println("*************************************************");

		// aort():对数组进行升序排列
		Arrays.sort(arr2);
		for (int num : arr2) {
			System.out.print(num + "\t");
		}
		System.out.println("\n降序排列结果");
		for (int i = arr1.length - 1; i >= 0; i--) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println("\n*************************************************");

		// toString():把一个数组转换成一个字符串
		System.out.println(Arrays.toString(arr1));
		System.out.println("\n*************************************************");

		// fill():将数组进行赋值
		int[] arrs = { 10, 30, 56, 95 };
		Arrays.fill(arrs, 40);
		System.out.println(Arrays.toString(arrs));

		System.out.println("\n*************************************************");

		// copyOf():把数组复制成一个新的长度的数组
		int[] arr11 = { 10, 56, 65, 89, 26 };
		int[] arr22 = Arrays.copyOf(arr11, 10);
		System.out.println(Arrays.toString(arr22));
		int[] arr33 = Arrays.copyOf(arr11, 8);
		System.out.println(Arrays.toString(arr33));

		// binarySearch():查找某个元素在数组中的位置(前提：数组已经升序排列好)
		System.out.println("***************************************************");
		int[] nums = { 85, 56, 59, 64 };
		Arrays.sort(nums);
		int index = Arrays.binarySearch(nums, 56);
		System.out.println(index);
		int index1 = Arrays.binarySearch(nums, 85);
		System.out.println(index1);

		System.out.println("***************************************************");
		// 选择排序
		int[] arr = { 4, 7, 3, 9, 1 };
		int min = -1;// 最小值下面标

		// 外层；比较
		for (int i = 0; i < arr.length - 1; i++) {
			min = i; // 每次min初始值
			// 内层：当前元素和后面的元素比较，记录最新的最小元素下标
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			// 如果min值发生变化，说明发现更小的值，则将当前值和更小的值交换，保证小值放在数组前面
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
