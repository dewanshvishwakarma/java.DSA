package practice;

public class Contain_Most_Water {
    static int MAX_AREA(int[] height){
        int n=height.length;
        int i=0;
        int j=n-1;
        int max_area=0;
        while(i<j){
            int width=j-i;
            int h=Math.min(height[i],height[j]);
            int area=width*h;
            max_area=Math.max(area,max_area);

            if (height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max_area;
    }
    public static void main(String[] args){
        int[] height={1,8,6,2,5,4,8,3,7,10};
        int result=MAX_AREA(height);
        System.out.println("maximum area is " + result);
 //        maximum area is 64
    }
}