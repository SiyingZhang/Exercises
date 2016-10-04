## Selection Sort

**Idea**: swap the smallest one in the following list with the first unsorted number. 

### Pseudocode
	repeat(length - 1) times
		set the first unsorted value as the MINIMUM value
		for each of the unsorted elements
			if(curr < MINIMUM)
				MINIMUM = curr
		swap MINIMUM with the first unsorted value


### Code
	public class SelectionSort {
		public int[] selectSort(int[] A) {
			if(A.length == 0 || A.length == 1) return A;
			
			int min = 0, temp = 0;
			for(int i=0; i<A.length-1; i++) {
				min = i;
				
				for(int j=i+1; j<A.length; j++) {
					if(A[j]<A[min]) min = j;
				}
				
				if(min != i) {
					temp = A[i];
					A[i] = A[min];
					A[min] = temp;
				}
			}
		}
	}

### Complexity
An in-place algorithm. O(n^2)

Simple, but inefficient.