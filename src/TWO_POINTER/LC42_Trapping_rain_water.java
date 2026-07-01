package TWO_POINTER;

public class LC42_Trapping_rain_water {
    static int TRW(int[] a){
        int n= a.length;
        int[] L_max=new int[a.length];
        int[] R_max=new int[a.length];
        L_max[0]=a[0];
        R_max[n-1]=a[n-1];
        for (int i=1;i<a.length;i++){
           L_max[i]= Math.max(a[i],L_max[i-1]);
        }
        for (int j=n-2;j>=0;j--){
            R_max[j]=Math.max(a[j],R_max[j+1]);
        }

        int ans=0;

        for (int k=0;k<n;k++){
            ans=ans+(Math.min(L_max[k],R_max[k])-a[k]);
        }
        return ans;
    }
    public static void main(String[] args) {
int[] h={3, 0, 1, 0, 4, 0, 2};
int ans=TRW(h);
        System.out.println(ans);
    }
}
