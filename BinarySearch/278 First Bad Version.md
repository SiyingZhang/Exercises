## 278 First Bad Version

**Binary Search**

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

Time Complexity: O(logn) Space: O(1)

	public class Solution extends VersionControl {
	    public int firstBadVersion(int n) {
	        int left = 1;
	        int right = n;
	        
	        while(left<right) {
	            int mid = left + (right-left)/2;
	            
	            if(isBadVersion(mid))
	                right = mid;
	            else
	                left = mid + 1;
	        }
	        
	        return left;
	    }
	}

The recursive way needs a helper function. 

	public int helper(int left, int right) {
		int mid = left + (right-left)/2;
		
		if(isBadVersion(mid)) {
			if(!isBadVersion(mid-1)) return mid;
			else
				return helper(left, mid);
		} else {
			if(isBadVersioin(mid+1)) return mid+1;
			else return helper(mid+1, right);
		}
	}