import com.sun.source.tree.BreakTree;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDArraySearch {
    public static void main(String[] args) {
        int[][] arr ={
                {21,5,67,45},
                {92,63,65},
                {83,12},
                {74,13,17,92}
        };
//        int target = 12;
//        int[] ans = search(arr,target);
//        System.out.println(Arrays.toString(ans));

    }
    
    
    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]  == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int[] minValue(int[][] arr,int target){
        int min = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]  < min){
                    min = arr[row][col];
                }
            }
        }
        return new int[]{-1,-1};
    }

}
