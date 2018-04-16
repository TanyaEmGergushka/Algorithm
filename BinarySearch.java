package sortingAlgorithms;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = {  2, 6, 8, 11, 15, 16, 19, 25, 50, 60, 77, 88, 100 };
		int /* x = 0; */ x = 19;
		int result = binarySearch(array, x, 0, array.length-1);
		System.out.println(result);
	}

	static int binarySearch(int[] arr, int x, int left, int right) {
		// when x is not contained in the array
		if (left >= right) {
			return -1;
		}

		// 1. find mid element
		int mid = (left + right) / 2;

		// 2. check if mid element is equal to x - if true, return mid index
		if (arr[mid] == x) {
			return mid;
		}

		// 3. if false: check if mid element is greater then x
		else if (arr[mid] > x) {

			// 3.1 if greater - search in left half
			return binarySearch(arr, x, left, mid - 1);
		} else {
			// 3.2 if lesser - search in right half
			return binarySearch(arr, x, mid + 1, right);

		}
	}
} 
