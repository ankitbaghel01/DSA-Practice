package String;

public class ReverseString {
  public static String reverseString(String str){
   String arr[] = str.split(" ");
   int left = 0, right = arr.length-1;

   while(left<right ){
    String temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    left++;
    right--;
   }

   return String.join(" ", arr);
    }
    public static void main(String args[]){
        String str = "my name is ankit";
        System.out.println(reverseString(str));
    }
}
