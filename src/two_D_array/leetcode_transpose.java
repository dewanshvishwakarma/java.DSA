package two_D_array;


public class leetcode_transpose {

    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] ans=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args){

    }
}
