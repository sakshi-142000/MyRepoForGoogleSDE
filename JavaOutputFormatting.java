//package Hackerrank Codes;


/*
 * Java's System.out.printf function
 * Similar to printf() function in c
 * 
 * 
 */

import java.util.Scanner;
public class JavaOutputFormatting {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i =12;
        double d=23.45;
        String s = "sakshi";
        System.out.printf("Integer: %d, Double %.2f, string %s \n", i, d, s);
        // format: %[flags][width][.precision]conversion
       
        //Left justify the strin by 10 width
        System.out.printf("%-10s %05d%n",s,i); 

        double negativeValue= -123456.78;
        System.out.printf("%(, .2f %n", negativeValue);
                                                    

        // while(scan.hasNextInt()){
        //     int i = scan.nextInt();
        //     scan.nextLine();
        //     String s = scan.nextLine();
        // }

        scan.close();

    }

    
    
}
