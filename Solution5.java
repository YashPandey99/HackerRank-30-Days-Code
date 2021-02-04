import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s;
        for(int i =0;i<n;i++){
            s=sc.next();
            for(int j=0;j<s.length();j=j+2){
                System.out.print(s.charAt(j));
                }
            System.out.print(" ");    
            for(int k=1;k<s.length();k=k+2){
                System.out.print(s.charAt(k));
                
            }
            System.out.println();
        }
    }
}