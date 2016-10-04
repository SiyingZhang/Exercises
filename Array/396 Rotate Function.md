## 396 Rotate Function

Given an array of integers A and let n to be its length.

Assume Bk to be an array obtained by rotating the array A k positions clock-wise, we define a "rotation function" F on A as follow:

F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].

Calculate the maximum value of F(0), F(1), ..., F(n-1)

### Solution 1
Time Limit Exceeded. 

* Time Comlexity: O(n^2) 
* Space Complexity: O(1)


	public class Solution {
	    public int maxRotateFunction(int[] A) {
	        if(A.length < 2) return 0;
	        
	        int l = A.length;
	        int curr = 0, max = Integer.MIN_VALUE;
	        
	        for(int i=0; i<l; i++) {
	            curr = 0;
	            for(int j=0; j<l; j++) {
	                curr += A[(j+i)%l]*j;
	            }
	            max = Math.max(max, curr);
	        }
	        
	        return max;
	    }
	}