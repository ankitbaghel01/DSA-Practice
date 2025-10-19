package String;

import java.util.Arrays;

public class stringCompression {


//     public static int compression(char[] c){
//     int i = 0, index = 0;
//     while(i<c.length){
//         char current = c[i];
//         int count = 0;

//         while(i<c.length && c[i] == current){
//             i++;
//             count++;
//         }

//         c[index++] = current;
        
        

//         if(count>=1){
//          for(char s : String.valueOf(count).toCharArray()){
//             c [index++] = s;
//          }
//         }
//     }
//     return index;
//   }

    
    public static char[] compression(String str){
       
        String n = "";
        int count = 1;
        
       for(int i = 0; i<str.length()-1; i++){
        if(str.charAt(i) == str.charAt(i+1)){
            count++;
        }else{
            n += str.charAt(i);
            n += count;
            count = 1;
        }
       }
     
        n += str.charAt(str.length()-1);
        n += count;

        return n.toCharArray();
    }

    public static void main(String arg[]){
        String str = "aabbcccc";  //   String str = "aabbcccc"; ---> output - [a, 2, b, 2, c, 4]
        char c[] = compression(str);
        System.out.println(Arrays.toString(c));
    }
}
