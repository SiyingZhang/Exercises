## 387 First Unique Character in a String

Using hashtable/hashmap because of duplicate key can't be stored.

Complexity - Time O(n) Space: O(1)


	import java.util.Hashtable;
	
	public class Solution {
	    public int firstUniqChar(String s) {
	        if(s.length() == 0) return -1;
	        
	        Hashtable<Character, Integer> chars = new Hashtable<>();
	        
	        for(int i=0; i<s.length(); i++) {
	            if(!chars.contains(s.charAt(i))) {
	                chars.put(s.charAt(i), i);
	            } else {
	                chars.put(s.charAt(i), Integer.MAX_VALUE);
	            }
	        }
	        
	        return Collections.min(chars.values())!=Integer.MAX_VALUE?Collections.min(chars.values()):-1;
	    }
	}