## 303 Range Sum Query

Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive

	public class NumArray {
	    
	    private int[] sum;
	
	    public NumArray(int[] nums) {
	        sum = nums;
	        
	        for(int i=1; i<nums.length; i++) {
	            sum[i] += sum[i-1];
	            System.out.println(sum[i]);
	        }
	    }
	
	    public int sumRange(int i, int j) {
	        if(i == 0) return sum[j];
	        return sum[j]-sum[i-1];
	    }
	}
	
Time complexity: O(1) Space Complexity: O(n)