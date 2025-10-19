package String;

public class longestSubstring {
  
   public static String findLongestSubstring(String str){
    String n = "";
    for(int i = 0; i<str.length();i++){
        char c = str.charAt(i);
        if(n.indexOf(c) == -1){
            n += c;
        }
    }
    return n;
   }
    public static void main(String arg[]){
        String s = "abcabcbb";
        System.out.println(findLongestSubstring(s));
    }
}
