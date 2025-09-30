package Array;

import java.util.Arrays;

public class FlattenTheArray {

    public static int[] flattenTheArray(int arr[][]){
        int totalLength = 0;
         for(int subArr[] : arr){
            totalLength += subArr.length;

         }

         int newArr[] = new int[totalLength];
         int i = 0;
         for(int subArr[] : arr){
            for(int ele : subArr){
                newArr[i++] = ele;
            }
         }
         System.out.println(Arrays.toString(newArr));
         return newArr;
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4,5},
                        {6,7,8,9}};
        // int arr1[] = flattenTheArray(arr)
        System.out.println(Arrays.toString(flattenTheArray(arr)));
    }
}
