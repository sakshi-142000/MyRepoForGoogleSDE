

/*
 * difference in next() and nextLine() methods of java scanner class 
 * package: Java.util package
 * Scanner breaks inputs into tokens using delimiter(whitespaces by default, for separating tokens) pattern
 * 
 * 
 * Learning from Hackerrank code is that:
 * If you use the nextLine() method immediately following the nextInt() method, 
 * recall that nextInt() reads integer tokens; because of this, 
 * the last newline character for that line of integer input is still queued in the input buffer and 
 * the next nextLine() will be reading the remainder of the integer line (which is empty).
 * 
 * therefore to avoid this, use a nextLine() method call post the nextInt() method call to consume the left '\n' delimiter from nextInt()
 * 
 */
 import java.util.Scanner;
 public class ReadInput{
    public static void main(String[] args){
        
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        double d= scan.nextDouble();
        //scan.nextLine();
        String s= scan.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + n);
        scan.close();
    }
}
