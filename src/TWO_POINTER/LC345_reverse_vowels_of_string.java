package TWO_POINTER;

public class LC345_reverse_vowels_of_string {
    static boolean Is_vowel(char c){
        if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }

    static String check(String s){
        char[] arr=s.toCharArray();
        int i=0;
        int j= arr.length-1;

        while(i<j){
            if (!Is_vowel(arr[i])){
                i++;
            } else if (!Is_vowel(arr[j])) {
                j--;
            }else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    static void main(String[] args) {
        String s="IceCreAm";
        String s1="leetcode";
        String result=check(s);
        String result2=check(s1);
        System.out.println(result);
        System.out.println(result2);
    }
}

