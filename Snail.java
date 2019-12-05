package rush10;

import java.util.Arrays;

public class Snail {
    public static void main(String[] args) {
        
        int[][] arr  = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
//        int[][] arr  = {};
        String intArrayString = Arrays.toString(snail(arr));
        System.out.println(intArrayString);
        System.out.println();

    }
    public static int[] snail(int[][] arr) {
            int[] out = new int[arr.length*arr.length];
            if (arr.length > 0 && arr[0].length == 0) {
            return new int [0];
            }
            int j=0;
            int i=0;
            int destr=0;
            int side=1;
            out[0] = arr[i][j];
        for (int k = 1; k < arr.length*arr.length; k++) {
            if (j<arr.length-destr&side==1) {
                if (j==0)j++;
                out[k] = arr[i][j];
                if (arr.length-destr==j+1){
                    side++;
                    i++;
                    continue;
                }
                j++;
            } else if (i<arr.length-destr&side==2) {
                out[k] = arr[i][j];
                if (arr.length-destr==i+1){
                    side++;
                    j--;
                    continue;
                }
                i++;
                
            } else if (j>=0+destr&side==3) {
                out[k] = arr[i][j];
                if (j==0+destr){
                    side++;
                    i--;
                    destr++;
                    continue;
                }
                j--;
                
            } else if (i>=0+destr&side==4) {
                out[k] = arr[i][j];
                if (i==0+destr){
                    side=1;
                    j++;
                    continue;
                }
                i--;
                
            }
           
        }
//        String intArrayString = Arrays.toString(out);
//        System.out.println(intArrayString);
        return out;
        
    }
}
