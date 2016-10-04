## Bubble Sort

Swap two neighbors if the left one is larger than the right one. 

### Pseudocode

	do
		swapped = false;
		for i=1 to unsortedIndex {
			if(arr[i] > arr[i+1])
				swap i & i+1;
				swapped = true;
		}
		
	while swapped

### Code
	public class BubbleSort {
		public int[] bubbleSort(int[] array) {
			boolean isSwapped = false;
			int count = array.length;
			int temp = 0;
			
			do {
				isSwapped = false;
				for(int i=0; i<count-1; i++) {
					if(array[i] > array[i+1]) {
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
						isSwapped = true;
					}
				}
				count --;
			} while(isSwapped)
		}
	}