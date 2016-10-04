public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {2, 1, 4, 3, 6, 9, 7, 8, 5};
		int[] sortedArr = selectSort(arr);

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int[] selectSort(int[] A) {
		if(A.length == 0 || A.length == 1) return A;
		
		int min = 0, temp = 0;
		for(int i=0; i<A.length-1; i++) {
			min = i;
			
			for(int j=i+1; j<A.length; j++) {
				if(A[j]<A[min]) {
					min = j;
				}
			}

			if(min != i) {
				temp = A[i];
				A[i] = A[min];
				A[min] = temp;
			}
		}
		return A;
	}
}