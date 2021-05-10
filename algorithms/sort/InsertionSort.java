package algorithms.sort;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr = {3, 5 ,2, 6, 7};
		sort(arr);
		print(arr);
	}
	
	private static void sort(int[] arr) {
		
		int key, j;
		
		for(int i = 1; i < arr.length - 1; i++) {
			key = arr[i];
			j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			
			arr[j + 1] = key;
		}
	}
	
	private static void print(int[] arr) {
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
