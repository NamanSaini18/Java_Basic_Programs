import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char [] ch = A.toCharArray();
        int flag = 0;
        
        for(int i=0;i<ch.length/2;i++){
            if(ch[i]!=ch[ch.length-1-i]){
                flag=1;
                break;
            }
            
        }
        if(flag==0){
            System.out.println("Yes");
            
        }
        else{
            System.out.println("No");
        }
        
    }
}
