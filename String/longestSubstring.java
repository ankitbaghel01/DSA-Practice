package String;

public class longestSubstring {
    public static String longestSubstring(String s){
       
        String n = "";
        for(char c : s.toCharArray()){
            if(n.indexOf(c) == -1){
                n += c;
            }
        }
    return n;
    }
    public static void main(String arg[]){
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }
}
