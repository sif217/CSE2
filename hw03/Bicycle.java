//Siyi Feng
//Homework 3
/*Bicycle Program: 
this program asks input two variables, 
the number of seconds and the number of counts, 
and output the total ditances in miles with two decimals 
and total time in minutes with one decimal 
as well as the average mph*/ 
//
//import a scanner
import java.util.Scanner;
// define a class
public class Bicycle{
    // define a method
    public static void main(String[] arg){
        Scanner myScanner;// declare a scanner
        myScanner = new Scanner(System.in);// construct a scanner
       
        // input data
        // print out the question asking the number of seconds
        System.out.print("Enter the number of seconds:");
        double seconds = myScanner.nextDouble();// declare a double, the number of seconds
        //print out the question asking the number of counts
        System.out.print("Enter the number of counts:");
        double counts = myScanner.nextDouble();// declare a double, the number of counts
        
        // intermediate variables 
		double wheelDiameter=27.0,// the diameter of the wheel    
		PI=3.14159,// the constant, pi
		feetPerMile=5280,// 1 mile=5280 ft
		inchesPerFoot=12,// 1 ft=12 inches
		secondsPerMinute=60,// 1 min=60 sec
		minutePerHour=60; // 1 hour=60 minute
		
		double distance;// declare a double, distance
		int miles;// declare an integer, miles
		double minutes;// taken time in minutes
		double hours;// taken time in hours
		double mph;// average mph
		int minutesint;// minutes in integer 
		int minutesintFirstDecimal;
		int milesFirstDecimal;// the first decimal of the distance in miles
		int milesSecondDecimal;// the second decimal of the distance in miles
		int mphint;//mph in integer
		int mphintFirstDecimal; 
		int mphintSecondDecimal;  
		
		
		distance = ((wheelDiameter * PI) * counts );// the total distance in inches
		distance/= (inchesPerFoot * feetPerMile);// the total distance in miles
		miles = (int) distance;// casting a double, distance, into a integer, miles
		
	
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
		milesFirstDecimal = (int) (distance * 10) % 10;
		milesSecondDecimal = (int) (distance * 100) % 10;
		minutes = seconds / secondsPerMinute;
		minutesint = (int) minutes;// casting a double, minutes, into an integer called minutesint
		minutesintFirstDecimal = (int) (minutes * 10) % 10; 
		hours = minutes / minutePerHour;// the total time in hours
		mph = distance / hours;//the average mph
		mphint = (int) mph;// casting a double,mph, into an integer called mphint
		mphintFirstDecimal = (int) (mph * 10) % 10; 
		mphintSecondDecimal = (int) (mph * 100) % 10;
		
		// output
		// print out the total distance and the total taken time
		System.out.println("The distance was "+miles+'.'
		+milesFirstDecimal+milesSecondDecimal
		+" miles and took "+minutesint+'.'+minutesintFirstDecimal
		+" minutes.");
		// print out the average mph
		System.out.println("The average mph was "+mphint+'.'+mphintFirstDecimal+mphintSecondDecimal);
        
        
    }
}