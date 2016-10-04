## 225 Implement Stack using Queue

Queue<> q = new LinkedList<>();

q.peek(); q.poll(); q.isEmpty() ...

Retrieve and remove **top** element, while stack remove tail element. 

    class MyStack {
    
      Queue<Integer> q = new LinkedList<Integer>();
      
      // Push element x onto stack.
      //O(n) Time; O(1) space
      public void push(int x) {
          q.add(x);
          
          int size = q.size();
          while(size-- >1) {
              q.add(q.poll());
          }
      }
  
      // Removes the element on top of the stack.
      public void pop() {
          q.poll();
      }
  
      // Get the top element.
      public int top() {
          return q.peek();
      }
  
      // Return whether the stack is empty.
      public boolean empty() {
          return q.isEmpty();
      }
    }