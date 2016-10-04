##155. Min Stack
1. Push(x)
2. pop()
3. top()
4. getMin()
	
		public class MinStack {
	    
	    Stack<Integer> s;
	    int curMin;
	
	    /** initialize your data structure here. */
	    public MinStack() {
	        s = new Stack<Integer>();
	        curMin = Integer.MAX_VALUE;
	    }
	    
	    public void push(int x) {
	        if(x<=curMin) {
	            s.push(curMin);
	            curMin = x;
	        }
	        s.push(x);
	    }
	    
	    public void pop() {
	        if(s.peek() == curMin) {
	            s.pop();
	            curMin = s.pop();
	        } else
	            s.pop();
	    }
	    
	    public int top() {
	        //if(s.empty())   return null;
	        return s.peek();
	    }
	    
	    public int getMin() {
	        return curMin;
	    }
		}