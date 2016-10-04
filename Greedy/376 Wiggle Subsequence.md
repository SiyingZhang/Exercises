## 376 Wiggle Subsequence

The key point for this question is to store the previous difference, and comparing it with the current difference. Be careful about the equal values.

	public class Solution {
	    public int wiggleMaxLength(int[] nums) {
	        if(nums.length < 2) return nums.length;
	        
	        int count = (nums[0]!=nums[1]) ? 2:1;
	        int preDiff = nums[1]-nums[0], curDiff = 0;
	        
	        for(int i=2; i<nums.length; i++) {
	            curDiff = nums[i] - nums[i-1];
	            
	            if(preDiff == 0) {
	                if(curDiff == preDiff) continue;
	                else {
	                    count++;
	                    preDiff = curDiff;
	                }
	            }
	            if(curDiff == 0 || curDiff*preDiff > 0) 
	                continue;
	            else {
	                count++;
	                preDiff = curDiff;
	            } 
	        }
	        
	        return count;
	    }
	}
	
Time Complexity: O(n)