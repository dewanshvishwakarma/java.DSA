package TWO_POINTER;

public class LC392_Is_subsequence {
    static boolean IS_sub(String s,String t){
        int i=0;
        int j=0;
        while (j<t.length()){
            if (s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }

            if (i==s.length()){
                return true;
            }
        }
            return false;
    }
    static void main(String[] args) {
boolean result=IS_sub("abc","ahbgdc");
boolean result2=IS_sub("axc","ahbgdc");
        System.out.println(result);
        System.out.println(result2);
    }
}
