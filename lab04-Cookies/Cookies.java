//Siyi Feng
//Lab 4
//Cookies Program
/*This program input how many people and cookies we have   
and how many cookies per person and out put whether there are enough cookies
and how many more cookies are needed and whether they are divived evenly*/
//
//import a scanner
import java.util.Scanner;
// define a class
 public class Cookies{
    			// define main method 
   			public static void main(String[] args) {
   			Scanner myScanner; // delcare an instance of scanner
   			myScanner = new Scanner( System.in );// construct a scanner 
   			 
   			// print out the question asking for the number of people
   			System.out.print("Enter the number of People: ");
   			
   			// if 1 the number of people is an integer
   			if(myScanner.hasNextInt()){
   			 // declare an integer, the number of people
   			int numberOfPeople = myScanner.nextInt();
   			   // if 2 the number of people is less than 0
   			   if(numberOfPeople < 0){
   			     System.out.println("You did not enter an int > 0");
   			   return;
   			 } // end of if 2
   			 
   			 // else if 2 the number of people is greater than 0  
   			 else{
   			   // print out the question asking for the number of cookies planned to
   			   System.out.print("Enter the number of cookies you are planning to buy: ");
   			  
   			 		// if 3 the number of cookies is an integer
   			   if(myScanner.hasNextInt()){
   			    // declare an integer, the number of cookies planned to buy
   			 		int numberOfCookies = myScanner.nextInt();
   			     // if 4 the number of cookies is less than 0
   			     if(numberOfCookies < 0){
   			       System.out.println("You did not enter an int > 0");
   			       return;
   			     } // the end of if 4 
   			     // else if 4 the number of cookies is an integer greater than 0
   			     else{
   			       // print out the question asking for how cookies you want each person to get
   			       System.out.print("How many do you want each person to get? ");
   			       
   			       // if 5 the number of cookies per person is an integer 
   			       if(myScanner.hasNextInt()){
   			         // delcare an integer, the number of cookies per person
   			         int numberOfCookiesPerPerson = myScanner.nextInt();
   			         // if 6 the number of cookies per person is less than 0 
   			         if(numberOfCookiesPerPerson < 0){
   			           System.out.print("You did not enter an int > 0");
   			           return;
   			         } // end of if 6
   			         // else if 6 the number of cookies per person is greater than 0
   			         else{
   			           // if 7 there is not enough cookies
   			           if( numberOfCookies < (numberOfPeople * numberOfCookiesPerPerson) ){
   			             int moreCookies = ((numberOfPeople * numberOfCookiesPerPerson) - numberOfCookies);
   			             System.out.println("You will not have enough cookies. You need to buy at least "
   			             +moreCookies+" more.");
   			           return;
   			           } // end of if 7
   			           // else if 7 there is enough cookies
   			           else{
   			             int remainder = numberOfCookies%numberOfPeople;
   			             // if 8 the cookies are divided evenly
   			             if(remainder == 0){
   			               System.out.print("You have enough cookies for each person and the amount will divide evenly.");
   			             return;
   			             } // end of if 8
   			             // else if 8 the cookies are not divided evenly 
   			             else{
   			               System.out.print("You have enough, but they will not divide evenly.");
   			             return;
   			             } // end of else if 8
   			             } // end of else 7
   			           } // end of else 6
   			         } // end of if 5
   	         // else if 5 the number of cookies per person is not an integer
   			       else{
   			          System.out.println("You did not enter an int");
                return; 
   			        } // end of else 5
   			     } // end of else if 4 
   			} // end of if 3
   			    
   			   // else if 3 the number of cookies is not an integer 
   			   else{ 
   			    System.out.println("You did not enter an int");
          return; 
   			 }// end of else 3
   			} // end of else 2
   			} // end of if 1
   			
   			// else if 1 the number is not an integer
   			else{ 
   			    System.out.println("You did not enter an int");
          return;  
   			} // end of else 1		 
   	}		 //end of main method   
  	} //end of class
     
 
 