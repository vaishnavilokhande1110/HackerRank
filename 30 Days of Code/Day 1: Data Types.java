import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i1;
        double d1;
        String m;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        i1 = scan.nextInt();
        d1 = scan.nextDouble();
        scan.nextLine();
        m = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        
        System.out.println(i+i1);
        
        
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+d1);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
            System.out.println(s+m);
        scan.close();
