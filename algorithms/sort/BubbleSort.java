package algorithms.sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {3, 5 ,2, 6, 7};
		sort(arr);
		print(arr);
	}
	
	/*
	 * Bubble Sort
	 */
	private static void sort(int[] arr) {
		
		//Traverse through array elements
		for(int i = 0; i < arr.length - 1; i++) {
			
			//Last i elements are in place
			//Traverse from 0 to arr.length - i - 1
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	/*
	 * Print elements in array
	 */
	private static void print(int[] arr) {
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
