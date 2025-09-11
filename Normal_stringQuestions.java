import java.util.Arrays;

public class Normal_stringQuestions {

// public static int count_the_repeated_characters(String str){ // hello -> 2 ('l' is repeated twice)
//  int count = 1; // as we are comparing with next character so we start from 1
//     for(int i =0; i<str.length()-1; i++){
//         if(str.charAt(i) == str.charAt(i+1)){
//             count++;
//         }
//     }
//     return count;removeSpecialChar
// }




public static String removeSpecialChar(String str){ //A@123$$#%nkit
    String output = str.replaceAll("[^a-zA-Z]", ""); // [^a-zA-Z] means except a-z and A-Z
    return output; // Ankit
}




public static void main(String args[]){
       String str="A@123$$#%nkit";
       System.out.println(removeSpecialChar(str));
    }
}
