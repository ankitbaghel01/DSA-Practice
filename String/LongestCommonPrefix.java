package String;
import java.util.*;
public class LongestCommonPrefix {
    
    // public static String longestCommonPrefix(String[] str){ // {"Ankit", "Ankush", "Ankita"} -> Ank

    //     Arrays.sort(str); // important step
    //     String first = str[0];
    //     String last = str[str.length-1];
    //     int min = Math.min(first.length(), last.length());
    //     int i=0;
    //     while(i<min && first.charAt(i) == last.charAt(i)){
    //      i++;
    //     }
    
    //     return first.substring(0, i);
    // }




    public static String longestCommonPrefix(String str[]){
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length -1];
        int min = Math.min(first.length(), last.length());
        int i = 0;
        while(i<min && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0, i);
    }
    
    public static void main(String args[]){
        String str[]={"Ankit", "Ankush", "Ankita"};
        System.out.println(longestCommonPrefix(str));
    }
}
