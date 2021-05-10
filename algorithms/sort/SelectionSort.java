package algorithms.sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {3, 5 ,2, 6, 7};
		sort(arr);
		print(arr);
	}

	private static void sort(int[] arr) {
		
		//Sort array from left to right
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			
			//Find minimum in unsorted array
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			//Swap unsorted leftmost element with minimum element 
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	private static void print(int[] arr) {
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
