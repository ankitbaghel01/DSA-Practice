package String;
import java.util.*;

public class MediamLevel{
  public static int compression(char[] c){
    int i = 0, index = 0;
    while(i<c.length){
        char current = c[i];
        int count = 0;

        while(i<c.length && c[i] == current){
            i++;
            count++;
        }

        c[index++] = current;
        
        

        if(count>=1){
         for(char s : String.valueOf(count).toCharArray()){
            c [index++] = s;
         }
        }
    }
    return index;
  }

public static void main(String args[]) {
    char c[] = {'a','a', 'b', 'b', 'c', 'c', 'c'}; // output --> a 2 b 2 c 3
    int length = compression(c);
    for(int i = 0;i<length;i++){
        System.out.print(c[i] + " ");
    }

}

}