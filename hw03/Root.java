//Siyi Feng
//Homework 3
/*Root Program: 
this program asks to input a double 
and output the estimate cube root
and the cube of the estimate cube root*/ 
//
//import a scanner
import java.util.Scanner;
//define a class
public class Root{
    //define a method 
    public static void main (String[] arg) {
        Scanner myScanner;// declare a scanner
        myScanner = new Scanner(System.in);// construct a scanner
        // print out a question asking a double
        System.out.print("Enter a double, and I print its cube root- ");
        double aDouble = myScanner.nextDouble();// declare a double
        
        double cube;// declare the cube of the estimate cube root
        double guess;// declare the guess of the cube root
        
        guess = aDouble/3;
        guess = ((((2 * guess) * guess) * guess) + aDouble) / ((3 * guess) * guess);
        guess = ((((2 * guess) * guess) * guess) + aDouble) / ((3 * guess) * guess);
        guess = ((((2 * guess) * guess) * guess) + aDouble) / ((3 * guess) * guess);
        guess = ((((2 * guess) * guess) * guess) + aDouble) / ((3 * guess) * guess);
        guess = ((((2 * guess) * guess) * guess) + aDouble) / ((3 * guess) * guess);
        
        cube = Math.pow(guess,3);// the equation of calculating the cube of the estimate cube root
        System.out.println("The cube root is "+guess);// print out the estimate cube root
        //print out the calculation of the cube
        System.out.println(guess+" * "+guess+" * "+guess+" = "+cube);
        
    }
}
