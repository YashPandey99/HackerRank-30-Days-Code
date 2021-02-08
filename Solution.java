import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String str =Integer.toBinaryString(n);
        //System.out.println(str);
        char[] ch = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
        } 
        int a=0;
        int max=0;
        for (int j = 0; j < ch.length; j++){
            if(ch[j]=='1'){
                a++;
                if(a>max){
                max=a;
            }
            }else {
                a=0;
            }
            
        }
        System.out.println(max);
    }
}
