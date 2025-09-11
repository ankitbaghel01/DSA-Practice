public class Anagram {
    public static boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }
     char[] c1 = s1.toLowerCase().toCharArray();
     char[] c2 = s2.toLowerCase().toCharArray();

     java.util.Arrays.sort(c1);
     java.util.Arrays.sort(c2);

     return java.util.Arrays.equals(c1, c2);
    }
    public static void main(String args[]){
        String s1 = "Listen";
        String s2 = "Silent";
        System.out.println(isAnagram(s1, s2));
    }
}
