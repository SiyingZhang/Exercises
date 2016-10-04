## 55 Jump Game

Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your **maximum** jump length at that position. This sentence means that you could jump to any elements inside the range of the maximum jump. 

Time Complexity: O(n)
	
	//reachable is the maximum jump until now.
	public class Solution {
	    public boolean canJump(int[] nums) {
	        int reachable = 0;
	        for(int i=0; i<nums.length; i++) {
	            if(i>reachable) return false;  //stuck at zero
	            reachable = Math.max(reachable, i+nums[i]);
	        }
	        
	        return true;
	    }
	}


	//This is the old wrong version
	public class Solution {
	    public boolean canJump(int[] nums) {
	        if(nums.length < 2) return true;
	        
	        int curr = 0, i = 0;
	        while (i<nums.length) {
	            curr = i;
	            
	            if(nums[i] == 0) {
	                if(curr == nums.length-1) return true;
	                else return false;
	            }
	            
	            i += nums[i];
	        }
	        
	        if(i >= nums.length || curr == nums.length-1) return true;
	        else return false;
	    }
	}