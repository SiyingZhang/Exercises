## 169 Majority Element
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times

	public class Solution {
	    public int majorityElement(int[] nums) {
	        
	        int majority = nums[0];
	        int count = 1;
	        
	        for(int i=1; i<nums.length; i++) {
	            if(count == 0) {
	                count ++;
	                majority = nums[i];
	            } else if(nums[i] == majority)
	                count ++;
	            else 
	                count --;
	        }
	        
	        return majority;
	    }
	}