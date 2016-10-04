## 70 Climbing Stairs
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

1) Find the recursive value: how many distinct ways can you climb to the *ith* level. 

2) Derive the recursive formula: You must pass (i-1) or (i-2) steps to climb to ith steps. f(i) = f(i-1) + f(i-2)

3) Find initial condition f(1/0) = 1 | f(2) = 2

recursive way costs too much time.

Time Complexity: O(n) Space Complexity O(n)

	public class Solution {
	    public int climbStairs(int n) {
	        
	        //n is 0 or 1
	        if(n < 2) return 1;
	        
	        int[] arr = new int[n+1];
	        
	        arr[0] = arr[1] = 1;
	        
	        for(int i=2; i<=n; i++) {
	            arr[i] = arr[i-1] + arr[i-2];
	        }
	        
	        //n = [n-1] + 1 OR [n-2] + 2
	        return arr[n];
	        
	    }
	}