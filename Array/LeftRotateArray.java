package Array;

import java.util.Arrays;

public class LeftRotateArray {


    public static int[] LeftRotate(int arr[], int n){
        int a[] = new int[arr.length];
        int t = 0;
        for(int i = n; i<arr.length; i++){
            a[t++] = arr[i];
        }

        for(int i = 0; i<n;i++){
            a[t++] = arr[i];
        }
        return a;
    }




    public static int [] moveAllZeroToEnd(int arr[]){
        int i = 0;

        for(int num : arr){
            if(num != 0){
                arr[i++] = num;

            }
        }

        while(i<arr.length){
            arr[i++] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,0,0,0,0,0,3,4,5};
        System.out.println(Arrays.toString(LeftRotate(arr, 3)));

        int a[] = moveAllZeroToEnd(arr);

        System.out.println(Arrays.toString(a));

    }
}
