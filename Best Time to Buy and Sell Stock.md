# Best Time to Buy and Sell Stock

## 121 
Tag: Array, Dynamic Programming | buy one sell one (Easy)

Time Complexity: O(n). Remember the minimum value, and the maximum difference. 

	public class Solution {
	    public int maxProfit(int[] prices) {
	        if(prices.length < 2) return 0;
	        
	        int min = prices[0];
	        int max = 0;
	        
	        for(int i=1; i<prices.length; i++) {
	            min = Math.min(prices[i], min);
	            max = Math.max(prices[i]-min, max);
	        }
	        
	        return max;
	    }
	}


## 122 II
Tag: Array Greedy (Medium)

You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

Time Complexity: O(n); the key point here is sell the previous one if you meet a lower price

	public class Solution {
	    public int maxProfit(int[] prices) {
	        if(prices.length < 2) return 0;
	        
	        int min = prices[0];
	        int total = 0, max = 0;
	        
	        for(int i=1; i<prices.length; i++) {
	            if(prices[i] < prices[i-1]) {
	                if(max > 0) {
	                    total += max;
	                    max = 0;
	                    System.out.println(total);
	                }
	                min = prices[i];
	            } else if(prices[i] - min > max)
	                max = prices[i] - min;
	        }
	        
	        if(max != 0) total += max;
	        return total;
	    }
	}

## 123 
Design an algorithm to find the maximum profit. You may complete at most two transactions.

Tag: Array Dynamic Programming (Hard)

	public class Solution {
		public int maxProfit(int[] prices) {
			if(prices.length<2) return 0;
			
			int l = prices.length;
			int[] preMaxPrices = new int[l];
			int[] postMaxPrices = new int[l];
			
			int min = prices[0];
			for(int i=1; i<l; i++) {
				min = Math.min(min, prices[i]);				preMaxPrices[i] = Math.max(preMaxPrices[i-1], preMaxPrices[i]-min);			
			}
			
			int max = prices[l-1];
			for(int j = l-2; j>=0; j--) {
				max = Math.max(max, prices[j]);
				postMaxPrices[j] = Math.max(postMaxPrices[j+1], max-postMaxPrices[j]);
			}
			
			int maxPrices = preMaxPrices[0] + postMaxPrices[0];
			for(int k=1; k<l; k++) {
				maxPrices = Math.max(maxPrices, preMaxPrices[k]+postMaxPrices[k]);			
			}
			
			return maxPrices;
		}
	}

