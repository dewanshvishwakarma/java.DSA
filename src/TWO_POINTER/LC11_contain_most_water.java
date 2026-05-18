package TWO_POINTER;

import javax.swing.*;

public class LC11_contain_most_water {
    static int contain(int[] a){
        int i=0;
        int j=a.length-1;
        int max_area=0;

        while (i<j){
            int h=Math.min(a[i],a[j]);
            int w=j-i;
            int area=h*w;
            max_area=Math.max(area,max_area);

            if(a[i]<a[j]){
                i++;
            }else {
                j--;
            }
    }
        return max_area;
}

    static void main(String[] args) {
        int[] a={1,8,6,2,5,4,8,3,7};
        int result=contain(a);
        System.out.println(result);
    }
}
