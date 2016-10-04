public class MergeSort {
	public static void main(String[] args) {
		int[] newArray = {2, 5, 3, 7, 8, 9, 1, 4, 6};
		int[] sorted = doMergeSort(newArray);

		for(int integer:sorted) {
			System.out.print(integer + " ");
		}
	}

	public static int[] doMergeSort(int[] arr) {
		int length = arr.length;
		if(length < 2) return arr;

		int mid = length/2;

		int[] l = new int[mid];
		int[] r = new int[length-mid];

		for(int i=0; i<mid; i++) {
			l[i] = arr[i];
			System.out.print(l[i] + " ");
		}
		System.out.println(" ");
		for(int j=mid; j<length; j++) {
			r[j-mid] = arr[j];
			System.out.print(r[j-mid] + " ");
		}
		System.out.println(" ");

		//Sort firstly
		l = doMergeSort(l);
		r = doMergeSort(r);

		arr = merge(l, r, arr);

		return arr;
	}

	//Do merge arrays
	public static int[] merge(int[] left, int[] right, int array[]) {
		int k = 0;
		int i = 0;
		int j = 0;

		while(i<left.length && j<right.length) {
			if(left[i] <= right[j])
				array[k++] = left[i++];
			else
				array[k++] = right[j++];
		}

		while(i<left.length) {
			array[k++] = left[i++];
		}

		while(j<right.length) {
			array[k++] = right[j++];
		}

		return array;
	}
}