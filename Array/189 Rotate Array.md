## 189 Rotate Array

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]

### Solution 1: Storing rotating elements in another array

Time Complexity: O(n-k) Space Complexity: O(k)

	public class Solution {
	    public void rotate(int[] nums, int k) {
	        if(k == 0) return;
	        
	        k = k%nums.length;
	        int[] temp = new int[k];
	        for(int i=0; i<k; i++) {
	            temp[i] = nums[nums.length-k+i];
	        }
	        
	        for(int j=nums.length-k-1; j>=0; j--) {
	            nums[j+k] = nums[j];
	        }
	        
	        for(int l=0; l<k; l++) {
	            nums[l] = temp[l];
	        }
	    }
	}
	
	
### Solution 2: reverse array

1. reverse (0, n-1)
2. reverse (0, k-1)
3. reverse (k, n-1)

Time Complexity: O(n) Space Complexity: O(1)
