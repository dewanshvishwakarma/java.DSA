import java.util.HashMap;

public class LC287 {
    static int duplicate(int[] a){
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<n;i++){
            if (map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else {
                map.put(a[i],1);
            }
        }

        int index=0;
        for (int j=0;j<n;j++){
            if (map.containsKey(a[j]) && map.get(a[j])>1){
                index=j;
            }
        }
        return a[index];
    }
    static void main(String[] args) {
        int[] a={3,1,3,4,2};
        int result=duplicate(a);
        System.out.println(result);
    }
}
