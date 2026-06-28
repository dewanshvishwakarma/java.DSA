package stack;
//link=https://leetcode.com/problems/valid-parentheses/description/
import java.util.Stack;

public class LC20_valid_parenthesis {
    static boolean Isvalid(String s){
        Stack<Character> st=new Stack<Character>();
        if (s.length()%2!=0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='('|| ch=='[' || ch=='{'){
                st.push(ch);
            }else {
                char top=st.peek();
                if (ch==')' && top!='('){
                    return false;
                } else if (ch=='}' && top!='{') {
                    return false;
                } else if (ch==']' && top!='[') {
                    return false;
                }else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }

    static boolean Lc20(String s){
        Stack<Character> st=new Stack<>();
        int l=s.length();
        for (int i=0;i<l;i++){
            char ch=s.charAt(i);
             if (ch=='('){
                 st.push(')');
             }else if(ch=='['){
                 st.push(']');
             } else if (ch=='{') {
                 st.push('}');
             } else{
                 if (st.isEmpty()){
                     return false;
                 }
                char top= st.peek();
                if (ch=='}' && top !='}'){
                    return false;
                }else if(ch==']' && top !=']'){
                    return false;
                }else if(ch==')' && top !=')'){
                    return false;
                }else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {

    }
}
