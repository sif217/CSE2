//Siyi Feng
//Feburary 06th 2015
//Lab 3
//BigMac Program
//This program uses imported data to compute the total cost
//
// import a scanner
import java.util.Scanner;
// define a class
public class BigMac {
    // define main method 
   	public static void main(String[] args) {
   	    Scanner myScanner;// declare an isntance of scanner
   	    myScanner = new Scanner( System.in );// constuct a scanner 
   	    
   	    // print out the question asking for the number of Big Macs
   	    System.out.print("Enter the number of Big Macs(an integer > 0): ");
   	    // declare an integer, the number of Big Macs
        int nBigMacs = myScanner.nextInt();
        
        // print out the question asking for the cost of a Big Mac
        System.out.print("Enter the cost per Big Mac as"
        +"double (in the form xx.xx):" );
        // declare an double, the cost of a Big Mac
        double bigMac$ = myScanner.nextDouble();
        // print out the question asking for the tax percentage 
	    System.out.print(
        "Enter the percent tax as a whole number (xx): ");
        // declare a double, the tax rate
        double taxRate = myScanner.nextDouble();
        //equation to covert a percentage to proportion
        taxRate/=100; 
  
        double cost$;// declare a double, total cost 
        int dollars,   //declare an integer, the whole dollar amount of cost 
        dimes, pennies; //declare integers for storing digits
        
        // equation of total cost= the number of Big Macs times the price per Big Mac with percent tax
        cost$ = nBigMacs*bigMac$*(1+taxRate);
		
        //get the whole amount, dropping decimal fraction
        // casting a double, the cost per Big Mac, into an integer called dollars
        dollars=(int)cost$;
		
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(cost$*10)%10;//casting a double, the remainder, into an integer 
        pennies=(int)(cost$*100)%10;//casting a double, the remainder, into an integer 
		
		// print out the total cost in dollars, dimes and pennies
        System.out.println("The total cost of " +nBigMacs
         +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
          " sales tax of "+ (int)(taxRate*100) + 
          "%, is $"+dollars+'.'+dimes+pennies);
    }  //end of main method   
} //end of class