package Array;

import java.util.Arrays;

public class FindLargestandLowest {

    // public static void LargeandLow(int arr[]) {

    //     //  very important step take all large in Integer.MIN_VALUE instead of arr[0]
    //     int large = Integer.MIN_VALUE;
    //     int secLarge = Integer.MIN_VALUE;
    //     int thirdLarge = Integer.MIN_VALUE;
    //    //  very important step take all Low in Integer.MAX_VALUE instead of arr[0]
    //     int low = Integer.MAX_VALUE;
    //     int secLow = Integer.MAX_VALUE;
    //     int thirdLow = Integer.MAX_VALUE;


    //    for(int i = 0 ; i< arr.length - 1; i++){
    //     int current = arr[i];

    //     if(current >large){
    //         thirdLarge = secLarge;
    //         secLarge = large;
    //         large = current;
    //     }else if(current > secLarge && current != large){
    //         thirdLarge = secLarge;
    //         secLarge = current;
    //     } else if( thirdLarge > current && current != secLarge && current != large){
    //         thirdLarge = current;
    //     }
  
    //      if(current < low){
    //         thirdLow = secLow;
    //         secLow = low;
    //         low = current;
    //     }else if(current < secLow && current != low){
    //        thirdLow = secLow;
    //         secLow = current;
    //     } else if( current < thirdLow && current != secLow && current != low){
    //         thirdLow = current;
    //     }
      
    //     }

    //     System.out.println("Largest: " + large + ", Second Largest: " + secLarge + ", Third Largest: " + thirdLarge);
    //     System.out.println("Lowest: " + low + ", Second Lowest: " + secLow + ", Third Lowest: " + thirdLow);
    // }


public static void findKthLargeandLowest(int arr[] , int k){

 for(int i = 0; i<arr.length; i++){
    for(int j =0; j<arr.length-1 ; j++){
   if(arr[j] > arr[j+1]){
    int temp = arr[j];
    arr[j]= arr[j+1];
    arr[j+1] = temp;
   }
    }
   
 }
 System.out.println(Arrays.toString(arr));

 int kth_max = arr[arr.length - k];
 int kth_min = arr[k-1];
 System.out.println("kth_max: "+ kth_max + " kth_min: "+ kth_min);
}


    public static void main(String args[]) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        // LargeandLow(arr);  //output -->  Largest: 6, Second Largest: 5, Third Largest: 4  Lowest: 1, Second Lowest: 4, Third Lowest: 5
       
        findKthLargeandLowest(arr, 3); // output --> 1st step -> [3, 4, 7, 10, 15, 20] and then  --> kth_max: 10 kth_min: 7


    }
}
