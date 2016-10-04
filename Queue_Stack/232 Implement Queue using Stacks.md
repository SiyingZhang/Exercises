## 232 Implement Queue using Stack
* push() - Push element x to the BACK
* pop() - Removes the element from in FRONT of queue
* peek() - Get the FRONT element
* empty() - Return whether the queue is EMPTY

Queue is **FIFO** | Stack is **LIFO(Last in First out)**

**push**: both push to end
| **pop**: queue from the head, stack from the end.

Two Stacks to implement queue

    class MyQueue {
      
      Stack<Integer> s1 = new Stack<Integer>();
      Stack<Integer> s2 = new Stack<Integer>();
      
      // Push element x to the back of queue.
      public void push(int x) {
          s1.push(x);
      }
  
      // Removes the element from in front of queue.
      public void pop() {
          if(s2.empty()) {
              while(!s1.empty()) {
                  s2.push(s1.pop());   
              }
          }
          s2.pop();
      }
  
      // Get the front element.
      public int peek() {
          if(s2.empty()) {
              while(!s1.empty()) {
                  s2.push(s1.pop());
              }
          }
          return s2.peek();
      }
  
      // Return whether the queue is empty.
      public boolean empty() {
          return s1.empty()&&s2.empty();
      }
    }

