public class QuickSortSolution {

	public static void main(String[] args) {
		int[] array = {2, 1, 7, 3, 6, 5, 9, 8, 4};
		quickSort(array, 0, array.length-1);

		for(int i:array) {
			System.out.print(i + " ");
		}
	}
	public static void quickSort(int[] arr, int start, int end) {
		int index = partition(arr, start, end);
		if(start < index - 1)
			quickSort(arr, start, index-1); 
		if(index < end)
			quickSort(arr, index, end);
	}
	
	public static int partition(int[] arr, int left, int right) {
		int i=left, j=right;
		int tmp;
		int pivot = arr[(right-left)/2+left];
		while(i<=j) {
			while(arr[i] < arr[pivot]) {
				i++;
			}
			while(arr[j] > arr[pivot]) {
				j--;
			}
			if(i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		
		return i;
	}
}