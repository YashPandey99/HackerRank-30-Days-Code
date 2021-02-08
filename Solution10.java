import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution10 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int x;
        double y;
        
        x=scan.nextInt();
        y=scan.nextDouble();
        scan.nextLine();
        String s2 = scan.nextLine();
       
       
        System.out.println(x+i);
        System.out.println(y+d);
        System.out.println(s + s2);
        
        scan.close();
    }
}