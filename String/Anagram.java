package String;
import java.util.*;

public class Anagram {

// check string is anagram or not 

//   public static boolean isAnagram(String s1, String s2){
//     if(s1.length() != s2.length()){
//         return false;
//     }

//     char[] a1 = s1.toLowerCase().toCharArray();
//     char[] a2 = s2.toLowerCase().toCharArray();
//     Arrays.sort(a1);
//     Arrays.sort(a2);
//     System.out.println(Arrays.toString(a1));
//     System.out.println(Arrays.toString(a2));

//     return Arrays.equals(a1, a2);
//   }





// group anagram

    public static List<List<String>> groupAnagrams(String str[]){
        
    Map<String ,List<String>> map = new HashMap<>();

    for(String word : str){
        char arr[] = word.toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);

        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(word);
    }
    return new ArrayList<>(map.values());
    }





    
    public static void main(String args[]){
        // String s1 = "Listen";
        // String s2 = "Silent";
        // System.out.println(isAnagram(s1, s2));
    
       String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"}; // [[eat, tea, ate], [bat], [tan, nat]]
        System.out.println(groupAnagrams(input));
    
    }
}
