//Siyi Feng
//Homework 3
/*FourDigits Program: 
this program asks to input a double 
and then output the first four digits 
to the right of the decimal point */ 
//
//import a scanner
import java.util.Scanner;
// define a class
public class FourDigits{
    // define a method 
    public static void main(String[] arg){
        Scanner myScanner;// declare a scanner
        myScanner = new Scanner(System.in);// construct a scanner
        
        // input data
        // print out the question asking for a double 
        System.out.print("Enter a double and I display the four digits to the right of the decimal point-");
        double adouble = myScanner.nextDouble();// declare the inputed double
        
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2
        int firstDecimal = (int) (adouble * 10) % 10;// casting a double into an integer  
        int secondDecimal = (int) (adouble * 100) % 10;
        int thirdDecimal = (int) (adouble * 1000) % 10;
        int fourthDecimal = (int) (adouble * 10000) % 10;
        
        // print out the result of the four digits to the right the decimal point
        System.out.print("The four digits are " +firstDecimal+secondDecimal+thirdDecimal+fourthDecimal);
        
    }
}