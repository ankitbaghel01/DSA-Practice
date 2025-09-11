class Palindrom{
    // public static boolean isPalindrom(String str){
    //   int left = 0, right = str.length()-1;
    //   while(left<right){
    //     if(str.charAt(left)!= str.charAt(right)){
    //         return false;
    //     }
    //     left++;
    //     right--;
    //   }
    //      return true;  
    // }

    
public static boolean isPalindrom(String str){
   String s = "";
    for(int i= str.length()-1; i>=0; i--){
      s += str.charAt(i);
    }
    if (s.equals(str)){
      return true;
    }

    return false;
}

    public static void main (String arg[]){
        String str="madm";
        System.out.println(isPalindrom(str));
    }
}