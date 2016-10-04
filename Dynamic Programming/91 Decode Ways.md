## 91 Decode Ways

A message containing letters from A-Z is being encoded to numbers using the following mapping:

A-> 1; B-> 2; ... ; Z->26

Similar to climbingStairs. O(n)

	public class Solution {
	    public int numDecodings(String s) {
	        //only one digit or empty
	        if(s.length() == 0 || s == null) return 0;
	        
	        //store the decode possible ways 
	        int[] decodeWays = new int[s.length()+1];
	        
	        decodeWays[0] = 1; 
	        decodeWays[1] = s.charAt(0) == '0'?0:1;
	        
	        for(int i=2; i<decodeWays.length; i++) {
	            int first = Integer.parseInt(s.substring(i-1, i));
	            int second = Integer.parseInt(s.substring(i-2, i));
	            if(first>0 && first<=9)
	                decodeWays[i] += decodeWays[i-1];
	            if(second >=10 && second<=26)
	                decodeWays[i] += decodeWays[i-2];
	        }
	        
	        return decodeWays[s.length()];
	    }
	}