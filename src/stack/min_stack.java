package stack;

import java.util.Stack;

 public  class min_stack {
        Stack<Integer> st=new Stack<>();
        static Stack<Integer>  ms=new Stack<>();

        public void push(int x){
            if (ms.isEmpty() || x<=ms.peek()){
                ms.push(x);
            }
            st.push(x);
        }

        public void pop(){
            if (st.peek().equals(ms.peek())){
                ms.pop();
            }
            st.pop();
        }

        public int peek(){
            if (st.isEmpty()){
                return -1;
            }
           return st.peek();
        }

     static public int minStack(){
            if (ms.isEmpty()){
                return -1;
            }
            return ms.peek();
        }
        
    public static   void main(String[] args) {
        min_stack m = new min_stack();

        m.push(4);
        m.push(5);
        m.push(-2);
        int n=minStack();
        System.out.println(n);
    }
        }
