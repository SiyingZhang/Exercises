##20 Valid Parentheses
To decide whether the string is valid only the brackets close in the correct order.

"{[]}()" is correct, "{[}](" is not correct.

**Time Complexity**: O(n)

	public class Solution {
	    public boolean isValid(String s) {
	        
	        if(s.length() < 2) return false;
	        
	        Stack<Character> brackets = new Stack<Character>();
	        char peekC = '-';
	        
	        for(int i=0; i<s.length(); i++) {
	            //Push the left bracket into stack
	            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
	                brackets.push(s.charAt(i));
	            else {
	                //No right bracket
	                if(brackets.empty()) return false;
	                peekC = brackets.peek();
	                //Decide whether close properly
	                if(peekC=='('&&s.charAt(i) == ')'||(peekC=='{'&&s.charAt(i)=='}')
	                ||(peekC=='['&&s.charAt(i)==']')){
	                    brackets.pop();
	                } else {
	                    return false;
	                }
	            }
	        }
	        return brackets.empty();
	    }
	}