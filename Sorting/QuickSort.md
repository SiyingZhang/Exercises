## QuickSort

Set one value as the pivot, and compare each of the rest with this one. Putting the smaller in the left, the larger ones in the right. 

* swap
* divide and conquer
* recursive
* in-place

**Different from Mergesort**: all work happens in the divide step. 

### Complexity



### Pseudocode

	for each unsorted partition
		set first element as pivot
		storeIndex = pivotIndex + 1
		for i=pivotIndex+1 to rightMostIndex
			//partitioning
			if element[i] < element[pivot]
				swap(i, storeIndex);
				storeIndex++;
		swap(pivot, storeIndex - 1)
		

### Code

	public void quickSort(int[] arr, int start, int end) {
		int index = partition(arr, start, end);
		if(start < index - 1)
			quickSort(arr, start, index-1); 
		if(index < end)
			quickSort(arr, index, end);
	}
	
	public int partition(int[] arr, int left, int right) {
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

